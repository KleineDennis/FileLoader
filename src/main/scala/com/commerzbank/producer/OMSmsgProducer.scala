package com.commerzbank.producer

import java.io.ByteArrayOutputStream
import java.util.{Properties, UUID}

import com.commerzbank.domain._
import kafka.producer.{KeyedMessage, Producer, ProducerConfig}
import org.apache.avro.Schema
import org.apache.avro.io._
import org.apache.avro.specific.SpecificDatumWriter
import org.apache.log4j.BasicConfigurator
import org.slf4j.LoggerFactory

import scala.io.Source


class OMSmsgProducer(brokers: String) {
  private val props = new Properties()
  props.put("metadata.broker.list", brokers)
  props.put("message.send.max.retries", "5")
  props.put("request.required.acks", "0")
  props.put("serializer.class", "kafka.serializer.DefaultEncoder")
  props.put("client.id", UUID.randomUUID.toString)

  private val producer = new Producer[String, Array[Byte]](new ProducerConfig(props))
  private val schemaString = Source.fromURL(getClass.getResource("/oms_schema.avsc")).mkString
  private val schema: Schema = new Schema.Parser().parse(schemaString)

  def send(topic: String, messages: List[OMSmsgFields]): Unit = {
    try {
      val queueMessages = messages map { msg =>
        // Serialize generic record object into byte array
        val writer = new SpecificDatumWriter[OMSmsgFields](schema)
        val out = new ByteArrayOutputStream()
        val encoder: BinaryEncoder = EncoderFactory.get().binaryEncoder(out, null)
        writer.write(msg, encoder)
        encoder.flush()
        out.close()

        val serializedBytes: Array[Byte] = out.toByteArray()
        new KeyedMessage[String, Array[Byte]](topic, serializedBytes)
      }
      producer.send(queueMessages: _*)
    } catch {
      case ex: Exception =>
        println(ex.printStackTrace().toString)
        ex.printStackTrace()
    }
  }
}

object OMSmsgProducerApp {
  def main(args: Array[String]) {
    if (args.length < 3) {
      System.err.println(s"""
        |Usage: DirectKafkaWordCount <brokers> <topics>
        |  <brokers> is a list of one or more Kafka brokers
        |  <topic> is the kafka topic to write to
        |  <file> is the path and name to the .csv file to read (e.g. C:/Users/et2kles/Downloads/orders.csv)
        |  <repeat> - repeats writing to the topic, (norepeat|repeat)
        |
        """.stripMargin)
      System.exit(1)
    }

    BasicConfigurator.configure()
    val log = LoggerFactory.getLogger(getClass)

    val Array(brokers, topic, file, repeat) = args

    log.info("Read Datafile")
    val list = read(file)
    list.foreach(x => log.info(x.toString))

    log.info("Start the OMSmsgProducer")
    val producer = new OMSmsgProducer(brokers)

    do
      producer.send(topic, list)
    while ( repeat.equalsIgnoreCase("repeat") )

    log.info("End the OMSmsgProducer")
  }

  def read(filename: String): List[OMSmsgFields] = {
    val format = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    def validate(str: String): Option[String] = Option[String](str).map(_.trim).filter(_.length != 0)
    def toByteArray(str: String): Array[Byte] = BigDecimal(str).setScale(17).underlying.unscaledValue.toByteArray

    val bufferedSource = Source.fromFile(filename) //TODO:  (filename, "UTF8")
    val list =
      for {
        line <- bufferedSource.getLines.drop(1).toList
        values = line.split(",").map(_.trim)
      } yield OMSmsgFields(
          schema_name = values(0)
        , schema_version = values(1).toInt
        , time = System.currentTimeMillis
        , message_uid = values(3)
        , source = values(4)
        , PENDING_ALLOC_IND = validate(values(5)).map(_.toLowerCase.contains("true"))
        , CLNT_INT_ID = validate(values(6))
        , CLNT_INT_ID_TYPE = validate(values(7)).map(CLNT_INT_ID_TYPES.valueOf(_))
        , BUY_SELL_OMS = validate(values(8)).map(BUY_SELL_OMSS.valueOf(_))
        , FIN_INSTR_ID_INT = validate(values(9))
        , FIN_INSTR_ID_INT_TYPE = validate(values(10)).map(FIN_INSTR_ID_INT_TYPES.valueOf(_))
        , PRICE = validate(values(11)).map(toByteArray)
        , PRICE_NOTATION = validate(values(12)).map(PRICE_NOTATION_TYPES.valueOf(_))
        , PRICE_MULTIPLIER = validate(values(13)).map(toByteArray)
        , PRICE_CURRENCY = validate(values(14))
        , CURR_CODE_LEG2 = validate(values(15))
        , OPTION_TYPE_OMS = validate(values(16)).map(OPTION_TYPES_OMS.valueOf(_))
        , STRIKE_PRICE = validate(values(17)).map(toByteArray).map(_ +: List())
        , STRIKE_PRICE_CURRENCY = validate(values(18)).map(_ +: List())
        , UP_FRONT_PAYMENT = validate(values(19)).map(toByteArray)
        , STTLM_DELIVERY_TYPE = validate(values(20)).map(STTLM_DELIVERY_TYPES.valueOf(_))
        , OPTION_EXERCISE_STYLE = validate(values(21)).map(OPTION_EXERCISE_STYLES.valueOf(_))
        , MATURITY_DATE = validate(values(22)).map(format.parse(_).getTime)
        , EXPIRY_DATE = validate(values(23)).map(format.parse(_).getTime)
        , QTY_CURRENCY = validate(values(24))
        , QTY_NOTATION = validate(values(25)).map(QTY_NOTATION_TYPES.valueOf(_))
        , INITIAL_QUANTITY = validate(values(26)).map(toByteArray)
        , DIRECTED_ORDER_IND = validate(values(27)).map(_.toLowerCase.contains("true"))
        , TRADING_CAPACITY_IND = validate(values(28)).map(TRADING_CAPACITY_INDS.valueOf(_))
        , LIQ_PROV_ACTIVITY = validate(values(29)).map(_.toLowerCase.contains("true"))
        , ORD_ID_EXT = validate(values(30))
        , ORD_ID_EXT_TYPE = validate(values(31)).map(ORD_ID_EXT_TYPES.valueOf(_))
        , ORDER_ID_INT = validate(values(32))
        , VENUE_MIC = validate(values(33))
        , ORDER_TYPE = validate(values(34))
        , LIMIT_PRICE = validate(values(35)).map(toByteArray)
        , ADDTL_LIMIT_PRICE = validate(values(36)).map(toByteArray)
        , STOP_PRICE = validate(values(37)).map(toByteArray)
        , PEGGED_LIMIT_PRICE = validate(values(38)).map(toByteArray)
        , REMAINING_QUANTITY = validate(values(39)).map(toByteArray)
        , DISPL_QUANTITY = validate(values(40)).map(toByteArray)
        , TRADED_QUANTITY = validate(values(41)).map(toByteArray)
        , MAQ = validate(values(42)).map(toByteArray)
        , MES = validate(values(43)).map(toByteArray)
        , MES_FIRST_EXEC_ONLY_IND = validate(values(44)).map(_.toLowerCase.contains("true"))
        , SELF_EXEC_PREVENT_IND = validate(values(45)).map(_.toLowerCase.contains("true"))
        , ORDER_SUBM_TS = validate(values(46)).map(format.parse(_).getTime)
        , ORDER_ENTRY_TS = validate(values(47)).map(format.parse(_).getTime)
        , EXECUTION_TS = validate(values(48)).map(format.parse(_).getTime)
        , ORDER_EVNT_CODE = ORDER_EVNT_CODE_TYPES.valueOf(values(49))
        , ORDER_ACTN = validate(values(50)).map(ORDER_ACTN_TYPES.valueOf(_))
        , SHORT_SELLING_IND = validate(values(51)).map(SHORT_SELLING_INDS.valueOf(_))
        , WAIVER_IND = validate(values(52)).map(WAIVER_IND_TYPES.valueOf(_)).map(_ +: List())
        , TRADING_VENUE_TRX_ID = validate(values(53))
        , VALIDITY_PERIOD_IND = validate(values(54)).map(VALIDITY_PERIOD_INDS.valueOf(_))
        , ORDER_RESTRICTION = validate(values(55)).map(ORDER_RESTRICTION_TYPES.valueOf(_))
        , VALIDITY_PERIOD_END_DATE = validate(values(56)).map(format.parse(_).getTime)
        , AGG_ORDER_IND = validate(values(57)).map(_.toLowerCase.contains("true"))
        , SEND_ENTITY_ID = validate(values(58))
        , SEND_ENTITY_ID_TYPE = validate(values(59)).map(SEND_ENTITY_ID_TYPES.valueOf(_))
        , UNDL_INSTR_ID = validate(values(60)).map(_ +: List())
        , UNDL_INSTR_ID_TYPE = validate(values(61)).map(UNDL_INSTR_ID_TYPES.valueOf(_)).map(_ +: List())
        , PASSV_AGGR_IND = validate(values(62)).map(PASSV_AGGR_INDS.valueOf(_))
        , EXEC_WITHIN_FIRM = validate(values(63))
        , PRODUCT_DESC = validate(values(64))
        , CONTRACT_ID = validate(values(65))
        , CURRENCY_PAIR = validate(values(66))
        , INVEST_DECISION_WITHIN_FIRM = validate(values(67))
        , COUNTRY_WHERE_ORD_RECEIVED = validate(values(68))
        , ACT_ON_BEHALF_CLIENT_ID = validate(values(69))
        , ACT_ON_BEHALF_CLIENT_ID_TYPE = validate(values(70)).map(ACT_ON_BEHALF_CLIENT_ID_TYPES.valueOf(_))
        , QUOTE_VALID_UNTIL = validate(values(71)).map(format.parse(_).getTime)
        , QUOTE_CXL_REASON = validate(values(72)).map(QUOTE_CXL_REASONS.valueOf(_))
        , PTT_EXMPT_REASON = validate(values(73)).map(PTT_EXMPT_REASONS.valueOf(_))
        , SPREAD = validate(values(74)).map(toByteArray)
        , XCHANGE_RATE = validate(values(75)).map(toByteArray)
        , REF_PRICE = validate(values(76)).map(toByteArray)
        , PAY_NOTIONAL = validate(values(77)).map(toByteArray)
        , RCV_NOTIONAL = validate(values(78)).map(toByteArray)
        , PAY_NOTIONAL_CURRENCY = validate(values(79))
        , RCV_NOTIONAL_CURRENCY = validate(values(80))
        , REPO_RATE = validate(values(81)).map(toByteArray)
        , STRIKE_PRICE_PEND = validate(values(82)).map(_.toLowerCase.contains("true"))
        , STRIKE_PRICE_NOTATION = validate(values(83)).map(STRIKE_PRICE_NOTATION_TYPES.valueOf(_)).map(_ +: List())
        , EXCH_SEQ_NR = validate(values(84)).map(_.toInt)
        , QUOTE_ACCEPT_TIME = validate(values(85)).map(format.parse(_).getTime)
        , COUNTERPARTY_ID = validate(values(86))
        , COUNTERPARTY_ID_TYPE = validate(values(87)).map(COUNTERPARTY_ID_TYPES.valueOf(_))
        , EXEC_ID_INT = validate(values(88))
        , SHORTCODE_CLIENT = validate(values(89))
        , SHORTCODE_IDM = validate(values(90))
        , SHORTCODE_EDM = validate(values(91))
      )

    bufferedSource.close
    list
  }
}