/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package com.commerzbank.domain.omega

import scala.annotation.switch

/**
 * This message schema is a subset of the PTRmsg schema, which includes all ORK fields. It is used for OMEGA, which is transforming the messages and send them to the APA. Use the builder to produce the object and set defaults like schema name and version.
 * @param schema_name Displays the avro schema name used.
 * @param schema_version Incremental integer that displays the avro schema version used.
 * @param time The time of message creation.
 * @param message_uid An ID that is globally unique within the sending OMS. Used as PK in PTR!
 * @param source The OMS providing the Message. Used as PK in PTR!
 * @param PENDING_ALLOC_IND ORK-004
 * @param BUY_SELL PTR-006: Based on ORK-010
 * @param FIN_INSTRUMENT_ID ORK-011
 * @param PRICE ORK-014
 * @param PRICE_NOTATION ORK-016
 * @param PRICE_MULTIPLIER ORK-017
 * @param PRICE_CURRENCY ORK-018
 * @param CURR_CODE_LEG2 ORK-019
 * @param OPTION_TYPE PTR-007: Based on ORK-021
 * @param STRIKE_PRICE ORK-022 max. 1000 values.
 * @param STRIKE_PRICE_CURRENCY ORK-023 Each value is VARCHAR(3), max. 1000 values.
 * @param UF_PAYMENT ORK-024
 * @param STTLM_DELIVERY_TYPE ORK-025
 * @param OPTION_EXERCISE_STYLE ORK-026
 * @param MATURITY_DATE ORK-027
 * @param EXPIRY_DATE ORK-028
 * @param QTY_CURRENCY ORK-029
 * @param QTY_NOTATION ORK-030
 * @param INITIAL_QUANTITY ORK-031
 * @param DIRECTED_ORDER_IND ORK-033
 * @param TRADING_CAPACITY_IND ORK-034
 * @param LIQ_PROV_ACTIVITY ORK-035
 * @param ORD_ID_EXT ORK-036 Datatype: VARCHAR(50) ORK-36 or 38 have to be provided in every message.
 * @param ORD_ID_EXT_TYPE ORK-037
 * @param ORDER_ID_INT ORK-038 Datatype: VARCHAR(50) ORK-36 or 38 have to be provided in every message.
 * @param VENUE_MIC ORK-041
 * @param ORDER_TYPE ORK-043 Datatype: VARCHAR(50)
 * @param LIMIT_PRICE ORK-044
 * @param ADD_LIMIT_PRICE ORK-045
 * @param STOP_PRICE ORK-046
 * @param PEGGED_LIMIT_PRICE ORK-047
 * @param REMAINING_QUANTITY ORK-048
 * @param DISPL_QUANTITY ORK-049
 * @param TRADED_QUANTITY ORK-050
 * @param MAQ ORK-051
 * @param MES ORK-052
 * @param MES_FIRST_EXEC_ONLY_IND ORK-053
 * @param SELF_EXEC_PREVENT_IND ORK-055
 * @param ORDER_SUBM_TS ORK-056
 * @param ORDER_ENTRY_TS ORK-058
 * @param EXECUTION_TS ORK-059
 * @param ORDER_EVNT_CODE ORK-061
 * @param ORDER_ACTN ORK-063
 * @param SHORT_SELLING_IND ORK-064
 * @param WAIVER_IND ORK-065
 * @param ROUTING_STRATEGY ORK-066
 * @param TRADING_VENUE_TRX_ID ORK-068
 * @param VALIDITY_PERIOD_IND ORK-069
 * @param ORDER_RESTRICTION ORK-070
 * @param VALIDITY_PERIOD_END_DATE ORK-071
 * @param AGG_ORDER_IND ORK-072
 * @param UNDL_INSTR_ID_E ORK-087: ORK-085 after enrich
 * @param PASSV_AGGR_IND ORK-088 Datatype: VARCHAR(4)
 * @param PRODUCT_DESC ORK-097
 * @param CONTRACT_ID ORK-098
 * @param CURRENCY_PAIR ORK-099
 * @param COUNTRY_WHERE_ORD_RECEIVED ORK-103
 * @param QUOTE_VALID_UNTIL ORK-106
 * @param QUOTE_CXL_REASON ORK-107
 * @param PTT_EXMPT_REASON ORK-108
 * @param SPREAD ORK-111
 * @param XCHANGE_RATE ORK-112
 * @param REF_PRICE ORK-113
 * @param PAY_NOTIONAL ORK-114
 * @param RCV_NOTIONAL ORK-115
 * @param PAY_NOTIONAL_CURRENCY ORK-116
 * @param RCV_NOTIONAL_CURRENCY ORK-117
 * @param REPO_RATE ORK-118
 * @param STRIKE_PRICE_PEND ORK-119
 * @param STRIKE_PRICE_NOTATION ORK-120 Each value is VARCHAR(4), max. 1000 values.
 * @param EXCH_SEQ_NR ORK-121
 * @param QUOTE_ACCEPT_TIME ORK-122
 * @param COUNTERPARTY_ID ORK-123 Datatype: VARCHAR(20)
 * @param COUNTERPARTY_ID_TYPE ORK-124 Datatype: VARCHAR(5)
 * @param EXEC_ID_INT ORK-125 Datatype: VARCHAR(5)
 */
case class OMEGAmsg(var schema_name: String = "OMEGAmsg", var schema_version: Int = 96, var time: Long, var message_uid: String, var source: String, var PENDING_ALLOC_IND: Option[Boolean] = None, var BUY_SELL: Option[BUY_SELL] = None, var FIN_INSTRUMENT_ID: Option[String] = None, var PRICE: Option[Array[Byte]] = None, var PRICE_NOTATION: Option[PRICE_NOTATION_TYPES] = None, var PRICE_MULTIPLIER: Option[Array[Byte]] = None, var PRICE_CURRENCY: Option[String] = None, var CURR_CODE_LEG2: Option[String] = None, var OPTION_TYPE: Option[OPTION_TYPES] = None, var STRIKE_PRICE: Option[List[Array[Byte]]] = None, var STRIKE_PRICE_CURRENCY: Option[List[String]] = None, var UF_PAYMENT: Option[Array[Byte]] = None, var STTLM_DELIVERY_TYPE: Option[STTLM_DELIVERY_TYPES] = None, var OPTION_EXERCISE_STYLE: Option[OPTION_EXERCISE_STYLES] = None, var MATURITY_DATE: Option[Long] = None, var EXPIRY_DATE: Option[Long] = None, var QTY_CURRENCY: Option[String] = None, var QTY_NOTATION: Option[QTY_NOTATION_TYPES] = None, var INITIAL_QUANTITY: Option[Array[Byte]] = None, var DIRECTED_ORDER_IND: Option[Boolean] = None, var TRADING_CAPACITY_IND: Option[TRADING_CAPACITY_INDS] = None, var LIQ_PROV_ACTIVITY: Option[Boolean] = None, var ORD_ID_EXT: Option[String] = None, var ORD_ID_EXT_TYPE: Option[ORD_ID_EXT_TYPES] = None, var ORDER_ID_INT: Option[String] = None, var VENUE_MIC: Option[String] = None, var ORDER_TYPE: Option[String] = None, var LIMIT_PRICE: Option[Array[Byte]] = None, var ADD_LIMIT_PRICE: Option[Array[Byte]] = None, var STOP_PRICE: Option[Array[Byte]] = None, var PEGGED_LIMIT_PRICE: Option[Array[Byte]] = None, var REMAINING_QUANTITY: Option[Array[Byte]] = None, var DISPL_QUANTITY: Option[Array[Byte]] = None, var TRADED_QUANTITY: Option[Array[Byte]] = None, var MAQ: Option[Array[Byte]] = None, var MES: Option[Array[Byte]] = None, var MES_FIRST_EXEC_ONLY_IND: Option[Boolean] = None, var SELF_EXEC_PREVENT_IND: Option[Boolean] = None, var ORDER_SUBM_TS: Option[Long] = None, var ORDER_ENTRY_TS: Option[Long] = None, var EXECUTION_TS: Option[Long] = None, var ORDER_EVNT_CODE: ORDER_EVNT_CODE_TYPES, var ORDER_ACTN: Option[ORDER_ACTN_TYPES] = None, var SHORT_SELLING_IND: Option[SHORT_SELLING_INDS] = None, var WAIVER_IND: Option[List[WAIVER_IND_TYPES]] = None, var ROUTING_STRATEGY: Option[String] = None, var TRADING_VENUE_TRX_ID: Option[String] = None, var VALIDITY_PERIOD_IND: Option[VALIDITY_PERIOD_INDS] = None, var ORDER_RESTRICTION: Option[ORDER_RESTRICTION_TYPES] = None, var VALIDITY_PERIOD_END_DATE: Option[Long] = None, var AGG_ORDER_IND: Option[Boolean] = None, var UNDL_INSTR_ID_E: Option[List[String]] = None, var PASSV_AGGR_IND: Option[PASSV_AGGR_INDS] = None, var PRODUCT_DESC: Option[String] = None, var CONTRACT_ID: Option[String] = None, var CURRENCY_PAIR: Option[String] = None, var COUNTRY_WHERE_ORD_RECEIVED: Option[String] = None, var QUOTE_VALID_UNTIL: Option[Long] = None, var QUOTE_CXL_REASON: Option[QUOTE_CXL_REASONS] = None, var PTT_EXMPT_REASON: Option[PTT_EXMPT_REASONS] = None, var SPREAD: Option[Array[Byte]] = None, var XCHANGE_RATE: Option[Array[Byte]] = None, var REF_PRICE: Option[Array[Byte]] = None, var PAY_NOTIONAL: Option[Array[Byte]] = None, var RCV_NOTIONAL: Option[Array[Byte]] = None, var PAY_NOTIONAL_CURRENCY: Option[String] = None, var RCV_NOTIONAL_CURRENCY: Option[String] = None, var REPO_RATE: Option[Array[Byte]] = None, var STRIKE_PRICE_PEND: Option[Boolean] = None, var STRIKE_PRICE_NOTATION: Option[List[STRIKE_PRICE_NOTATION_TYPES]] = None, var EXCH_SEQ_NR: Option[Int] = None, var QUOTE_ACCEPT_TIME: Option[Long] = None, var COUNTERPARTY_ID: Option[String] = None, var COUNTERPARTY_ID_TYPE: Option[COUNTERPARTY_ID_TYPES] = None, var EXEC_ID_INT: Option[String] = None) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("OMEGAmsg", 96, 0L, "", "", None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, null, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        schema_name
      }.asInstanceOf[AnyRef]
      case 1 => {
        schema_version
      }.asInstanceOf[AnyRef]
      case 2 => {
        time
      }.asInstanceOf[AnyRef]
      case 3 => {
        message_uid
      }.asInstanceOf[AnyRef]
      case 4 => {
        source
      }.asInstanceOf[AnyRef]
      case 5 => {
        PENDING_ALLOC_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 6 => {
        BUY_SELL match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 7 => {
        FIN_INSTRUMENT_ID match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 8 => {
        PRICE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 9 => {
        PRICE_NOTATION match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 10 => {
        PRICE_MULTIPLIER match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 11 => {
        PRICE_CURRENCY match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 12 => {
        CURR_CODE_LEG2 match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 13 => {
        OPTION_TYPE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 14 => {
        STRIKE_PRICE match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              java.nio.ByteBuffer.wrap(x)
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 15 => {
        STRIKE_PRICE_CURRENCY match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              x
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 16 => {
        UF_PAYMENT match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 17 => {
        STTLM_DELIVERY_TYPE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 18 => {
        OPTION_EXERCISE_STYLE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 19 => {
        MATURITY_DATE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 20 => {
        EXPIRY_DATE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 21 => {
        QTY_CURRENCY match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 22 => {
        QTY_NOTATION match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 23 => {
        INITIAL_QUANTITY match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 24 => {
        DIRECTED_ORDER_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 25 => {
        TRADING_CAPACITY_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 26 => {
        LIQ_PROV_ACTIVITY match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 27 => {
        ORD_ID_EXT match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 28 => {
        ORD_ID_EXT_TYPE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 29 => {
        ORDER_ID_INT match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 30 => {
        VENUE_MIC match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 31 => {
        ORDER_TYPE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 32 => {
        LIMIT_PRICE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 33 => {
        ADD_LIMIT_PRICE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 34 => {
        STOP_PRICE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 35 => {
        PEGGED_LIMIT_PRICE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 36 => {
        REMAINING_QUANTITY match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 37 => {
        DISPL_QUANTITY match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 38 => {
        TRADED_QUANTITY match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 39 => {
        MAQ match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 40 => {
        MES match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 41 => {
        MES_FIRST_EXEC_ONLY_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 42 => {
        SELF_EXEC_PREVENT_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 43 => {
        ORDER_SUBM_TS match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 44 => {
        ORDER_ENTRY_TS match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 45 => {
        EXECUTION_TS match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 46 => {
        ORDER_EVNT_CODE
      }.asInstanceOf[AnyRef]
      case 47 => {
        ORDER_ACTN match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 48 => {
        SHORT_SELLING_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 49 => {
        WAIVER_IND match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              x
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 50 => {
        ROUTING_STRATEGY match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 51 => {
        TRADING_VENUE_TRX_ID match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 52 => {
        VALIDITY_PERIOD_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 53 => {
        ORDER_RESTRICTION match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 54 => {
        VALIDITY_PERIOD_END_DATE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 55 => {
        AGG_ORDER_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 56 => {
        UNDL_INSTR_ID_E match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              x
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 57 => {
        PASSV_AGGR_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 58 => {
        PRODUCT_DESC match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 59 => {
        CONTRACT_ID match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 60 => {
        CURRENCY_PAIR match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 61 => {
        COUNTRY_WHERE_ORD_RECEIVED match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 62 => {
        QUOTE_VALID_UNTIL match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 63 => {
        QUOTE_CXL_REASON match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 64 => {
        PTT_EXMPT_REASON match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 65 => {
        SPREAD match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 66 => {
        XCHANGE_RATE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 67 => {
        REF_PRICE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 68 => {
        PAY_NOTIONAL match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 69 => {
        RCV_NOTIONAL match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 70 => {
        PAY_NOTIONAL_CURRENCY match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 71 => {
        RCV_NOTIONAL_CURRENCY match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 72 => {
        REPO_RATE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 73 => {
        STRIKE_PRICE_PEND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 74 => {
        STRIKE_PRICE_NOTATION match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              x
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 75 => {
        EXCH_SEQ_NR match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 76 => {
        QUOTE_ACCEPT_TIME match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 77 => {
        COUNTERPARTY_ID match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 78 => {
        COUNTERPARTY_ID_TYPE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 79 => {
        EXEC_ID_INT match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.schema_name = {
        value.toString
      }.asInstanceOf[String]
      case 1 => this.schema_version = {
        value
      }.asInstanceOf[Int]
      case 2 => this.time = {
        value
      }.asInstanceOf[Long]
      case 3 => this.message_uid = {
        value.toString
      }.asInstanceOf[String]
      case 4 => this.source = {
        value.toString
      }.asInstanceOf[String]
      case 5 => this.PENDING_ALLOC_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 6 => this.BUY_SELL = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[BUY_SELL]]
      case 7 => this.FIN_INSTRUMENT_ID = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 8 => this.PRICE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 9 => this.PRICE_NOTATION = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[PRICE_NOTATION_TYPES]]
      case 10 => this.PRICE_MULTIPLIER = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 11 => this.PRICE_CURRENCY = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 12 => this.CURR_CODE_LEG2 = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 13 => this.OPTION_TYPE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[OPTION_TYPES]]
      case 14 => this.STRIKE_PRICE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (array: java.util.List[_]) => {
              List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
                x match {
                  case (buffer: java.nio.ByteBuffer) => {
                    buffer.array()
                  }
                }
              }: _*))
            }
          })
        }
      }.asInstanceOf[Option[List[Array[Byte]]]]
      case 15 => this.STRIKE_PRICE_CURRENCY = {
        value match {
          case null => None
          case _ => Some(value match {
            case (array: java.util.List[_]) => {
              List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
                x.toString
              }: _*))
            }
          })
        }
      }.asInstanceOf[Option[List[String]]]
      case 16 => this.UF_PAYMENT = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 17 => this.STTLM_DELIVERY_TYPE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[STTLM_DELIVERY_TYPES]]
      case 18 => this.OPTION_EXERCISE_STYLE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[OPTION_EXERCISE_STYLES]]
      case 19 => this.MATURITY_DATE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 20 => this.EXPIRY_DATE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 21 => this.QTY_CURRENCY = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 22 => this.QTY_NOTATION = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[QTY_NOTATION_TYPES]]
      case 23 => this.INITIAL_QUANTITY = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 24 => this.DIRECTED_ORDER_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 25 => this.TRADING_CAPACITY_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[TRADING_CAPACITY_INDS]]
      case 26 => this.LIQ_PROV_ACTIVITY = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 27 => this.ORD_ID_EXT = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 28 => this.ORD_ID_EXT_TYPE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[ORD_ID_EXT_TYPES]]
      case 29 => this.ORDER_ID_INT = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 30 => this.VENUE_MIC = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 31 => this.ORDER_TYPE = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 32 => this.LIMIT_PRICE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 33 => this.ADD_LIMIT_PRICE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 34 => this.STOP_PRICE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 35 => this.PEGGED_LIMIT_PRICE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 36 => this.REMAINING_QUANTITY = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 37 => this.DISPL_QUANTITY = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 38 => this.TRADED_QUANTITY = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 39 => this.MAQ = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 40 => this.MES = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 41 => this.MES_FIRST_EXEC_ONLY_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 42 => this.SELF_EXEC_PREVENT_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 43 => this.ORDER_SUBM_TS = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 44 => this.ORDER_ENTRY_TS = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 45 => this.EXECUTION_TS = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 46 => this.ORDER_EVNT_CODE = {
        value
      }.asInstanceOf[ORDER_EVNT_CODE_TYPES]
      case 47 => this.ORDER_ACTN = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[ORDER_ACTN_TYPES]]
      case 48 => this.SHORT_SELLING_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[SHORT_SELLING_INDS]]
      case 49 => this.WAIVER_IND = {
        value match {
          case null => None
          case _ => Some(value match {
            case (array: java.util.List[_]) => {
              List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
                x
              }: _*))
            }
          })
        }
      }.asInstanceOf[Option[List[WAIVER_IND_TYPES]]]
      case 50 => this.ROUTING_STRATEGY = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 51 => this.TRADING_VENUE_TRX_ID = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 52 => this.VALIDITY_PERIOD_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[VALIDITY_PERIOD_INDS]]
      case 53 => this.ORDER_RESTRICTION = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[ORDER_RESTRICTION_TYPES]]
      case 54 => this.VALIDITY_PERIOD_END_DATE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 55 => this.AGG_ORDER_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 56 => this.UNDL_INSTR_ID_E = {
        value match {
          case null => None
          case _ => Some(value match {
            case (array: java.util.List[_]) => {
              List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
                x.toString
              }: _*))
            }
          })
        }
      }.asInstanceOf[Option[List[String]]]
      case 57 => this.PASSV_AGGR_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[PASSV_AGGR_INDS]]
      case 58 => this.PRODUCT_DESC = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 59 => this.CONTRACT_ID = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 60 => this.CURRENCY_PAIR = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 61 => this.COUNTRY_WHERE_ORD_RECEIVED = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 62 => this.QUOTE_VALID_UNTIL = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 63 => this.QUOTE_CXL_REASON = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[QUOTE_CXL_REASONS]]
      case 64 => this.PTT_EXMPT_REASON = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[PTT_EXMPT_REASONS]]
      case 65 => this.SPREAD = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 66 => this.XCHANGE_RATE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 67 => this.REF_PRICE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 68 => this.PAY_NOTIONAL = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 69 => this.RCV_NOTIONAL = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 70 => this.PAY_NOTIONAL_CURRENCY = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 71 => this.RCV_NOTIONAL_CURRENCY = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 72 => this.REPO_RATE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 73 => this.STRIKE_PRICE_PEND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 74 => this.STRIKE_PRICE_NOTATION = {
        value match {
          case null => None
          case _ => Some(value match {
            case (array: java.util.List[_]) => {
              List((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
                x
              }: _*))
            }
          })
        }
      }.asInstanceOf[Option[List[STRIKE_PRICE_NOTATION_TYPES]]]
      case 75 => this.EXCH_SEQ_NR = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Int]]
      case 76 => this.QUOTE_ACCEPT_TIME = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 77 => this.COUNTERPARTY_ID = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 78 => this.COUNTERPARTY_ID_TYPE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[COUNTERPARTY_ID_TYPES]]
      case 79 => this.EXEC_ID_INT = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = OMEGAmsg.SCHEMA$
}

object OMEGAmsg {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OMEGAmsg\",\"namespace\":\"com.commerzbank.domain.omega\",\"doc\":\"This message schema is a subset of the PTRmsg schema, which includes all ORK fields. It is used for OMEGA, which is transforming the messages and send them to the APA. Use the builder to produce the object and set defaults like schema name and version.\",\"fields\":[{\"name\":\"schema_name\",\"type\":\"string\",\"doc\":\"Displays the avro schema name used.\",\"default\":\"OMEGAmsg\"},{\"name\":\"schema_version\",\"type\":\"int\",\"doc\":\"Incremental integer that displays the avro schema version used.\",\"default\":96},{\"name\":\"time\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"},\"doc\":\"The time of message creation.\"},{\"name\":\"message_uid\",\"type\":\"string\",\"doc\":\"An ID that is globally unique within the sending OMS. Used as PK in PTR!\"},{\"name\":\"source\",\"type\":\"string\",\"doc\":\"The OMS providing the Message. Used as PK in PTR!\"},{\"name\":\"PENDING_ALLOC_IND\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-004\",\"default\":null},{\"name\":\"BUY_SELL\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"BUY_SELL\",\"symbols\":[\"BUYI\",\"SELL\"]}],\"doc\":\"PTR-006: Based on ORK-010\",\"default\":null},{\"name\":\"FIN_INSTRUMENT_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-011\",\"default\":null},{\"name\":\"PRICE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-014\",\"default\":null},{\"name\":\"PRICE_NOTATION\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"PRICE_NOTATION_TYPES\",\"symbols\":[\"MONE\",\"PERC\",\"YIEL\",\"BAPO\"]}],\"doc\":\"ORK-016\",\"default\":null},{\"name\":\"PRICE_MULTIPLIER\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-017\",\"default\":null},{\"name\":\"PRICE_CURRENCY\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-018\",\"default\":null},{\"name\":\"CURR_CODE_LEG2\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-019\",\"default\":null},{\"name\":\"OPTION_TYPE\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"OPTION_TYPES\",\"symbols\":[\"CALL\",\"PUTO\",\"OTHR\"]}],\"doc\":\"PTR-007: Based on ORK-021\",\"default\":null},{\"name\":\"STRIKE_PRICE\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}}],\"doc\":\"ORK-022 max. 1000 values.\",\"default\":null},{\"name\":\"STRIKE_PRICE_CURRENCY\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"ORK-023 Each value is VARCHAR(3), max. 1000 values.\",\"default\":null},{\"name\":\"UF_PAYMENT\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-024\",\"default\":null},{\"name\":\"STTLM_DELIVERY_TYPE\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"STTLM_DELIVERY_TYPES\",\"symbols\":[\"PHYS\",\"CASH\",\"OPTL\"]}],\"doc\":\"ORK-025\",\"default\":null},{\"name\":\"OPTION_EXERCISE_STYLE\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"OPTION_EXERCISE_STYLES\",\"symbols\":[\"EURO\",\"AMER\",\"ASIA\",\"BERM\",\"OTHR\"]}],\"doc\":\"ORK-026\",\"default\":null},{\"name\":\"MATURITY_DATE\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-027\",\"default\":null},{\"name\":\"EXPIRY_DATE\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-028\",\"default\":null},{\"name\":\"QTY_CURRENCY\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-029\",\"default\":null},{\"name\":\"QTY_NOTATION\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"QTY_NOTATION_TYPES\",\"symbols\":[\"UNIT\",\"NOML\",\"MONE\"]}],\"doc\":\"ORK-030\",\"default\":null},{\"name\":\"INITIAL_QUANTITY\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-031\",\"default\":null},{\"name\":\"DIRECTED_ORDER_IND\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-033\",\"default\":null},{\"name\":\"TRADING_CAPACITY_IND\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TRADING_CAPACITY_INDS\",\"symbols\":[\"DEAL\",\"MTCH\",\"AOTC\"]}],\"doc\":\"ORK-034\",\"default\":null},{\"name\":\"LIQ_PROV_ACTIVITY\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-035\",\"default\":null},{\"name\":\"ORD_ID_EXT\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-036 Datatype: VARCHAR(50) ORK-36 or 38 have to be provided in every message.\",\"default\":null},{\"name\":\"ORD_ID_EXT_TYPE\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ORD_ID_EXT_TYPES\",\"symbols\":[\"TRDVN\",\"BROK\",\"CLNT\"]}],\"doc\":\"ORK-037\",\"default\":null},{\"name\":\"ORDER_ID_INT\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-038 Datatype: VARCHAR(50) ORK-36 or 38 have to be provided in every message.\",\"default\":null},{\"name\":\"VENUE_MIC\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-041\",\"default\":null},{\"name\":\"ORDER_TYPE\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-043 Datatype: VARCHAR(50)\",\"default\":null},{\"name\":\"LIMIT_PRICE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-044\",\"default\":null},{\"name\":\"ADD_LIMIT_PRICE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-045\",\"default\":null},{\"name\":\"STOP_PRICE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-046\",\"default\":null},{\"name\":\"PEGGED_LIMIT_PRICE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-047\",\"default\":null},{\"name\":\"REMAINING_QUANTITY\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-048\",\"default\":null},{\"name\":\"DISPL_QUANTITY\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-049\",\"default\":null},{\"name\":\"TRADED_QUANTITY\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-050\",\"default\":null},{\"name\":\"MAQ\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-051\",\"default\":null},{\"name\":\"MES\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-052\",\"default\":null},{\"name\":\"MES_FIRST_EXEC_ONLY_IND\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-053\",\"default\":null},{\"name\":\"SELF_EXEC_PREVENT_IND\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-055\",\"default\":null},{\"name\":\"ORDER_SUBM_TS\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-056\",\"default\":null},{\"name\":\"ORDER_ENTRY_TS\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-058\",\"default\":null},{\"name\":\"EXECUTION_TS\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-059\",\"default\":null},{\"name\":\"ORDER_EVNT_CODE\",\"type\":{\"type\":\"enum\",\"name\":\"ORDER_EVNT_CODE_TYPES\",\"symbols\":[\"RFQ\",\"QUOT\",\"INCOR\",\"OUTOR\",\"EXCOR\"]},\"doc\":\"ORK-061\"},{\"name\":\"ORDER_ACTN\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ORDER_ACTN_TYPES\",\"symbols\":[\"NEWO\",\"CANCL\",\"RJCT\",\"TRIG\",\"REME\",\"REMA\",\"REMH\",\"CHME\",\"CHMO\",\"CAME\",\"CAMO\",\"EXPI\",\"PARF\",\"FILL\",\"INACT\",\"REMO\",\"CACL\",\"RJTCL\",\"CAEXC\"]}],\"doc\":\"ORK-063\",\"default\":null},{\"name\":\"SHORT_SELLING_IND\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"SHORT_SELLING_INDS\",\"symbols\":[\"SSHO\",\"SSEX\",\"SELL\",\"UNDI\"]}],\"doc\":\"ORK-064\",\"default\":null},{\"name\":\"WAIVER_IND\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"WAIVER_IND_TYPES\",\"symbols\":[\"LRGS\",\"RFPT\",\"NLIQ\",\"OILQ\",\"PRIC\",\"SIZE\",\"ILQD\",\"ESCB\"]}}],\"doc\":\"ORK-065\",\"default\":null},{\"name\":\"ROUTING_STRATEGY\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-066\",\"default\":null},{\"name\":\"TRADING_VENUE_TRX_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-068\",\"default\":null},{\"name\":\"VALIDITY_PERIOD_IND\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"VALIDITY_PERIOD_INDS\",\"symbols\":[\"GDAY\",\"GTCA\",\"GTHT\",\"GTHD\",\"GTDT\",\"GAFT\",\"GAFD\",\"GADT\",\"IOCA\",\"FORK\",\"OTHR\"]}],\"doc\":\"ORK-069\",\"default\":null},{\"name\":\"ORDER_RESTRICTION\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ORDER_RESTRICTION_TYPES\",\"symbols\":[\"SESR\",\"VFAR\",\"VFCR\",\"OTHR\"]}],\"doc\":\"ORK-070\",\"default\":null},{\"name\":\"VALIDITY_PERIOD_END_DATE\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-071\",\"default\":null},{\"name\":\"AGG_ORDER_IND\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-072\",\"default\":null},{\"name\":\"UNDL_INSTR_ID_E\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"ORK-087: ORK-085 after enrich\",\"default\":null},{\"name\":\"PASSV_AGGR_IND\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"PASSV_AGGR_INDS\",\"symbols\":[\"PASS\",\"AGGR\"]}],\"doc\":\"ORK-088 Datatype: VARCHAR(4)\",\"default\":null},{\"name\":\"PRODUCT_DESC\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-097\",\"default\":null},{\"name\":\"CONTRACT_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-098\",\"default\":null},{\"name\":\"CURRENCY_PAIR\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-099\",\"default\":null},{\"name\":\"COUNTRY_WHERE_ORD_RECEIVED\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-103\",\"default\":null},{\"name\":\"QUOTE_VALID_UNTIL\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-106\",\"default\":null},{\"name\":\"QUOTE_CXL_REASON\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"QUOTE_CXL_REASONS\",\"symbols\":[\"MKTDIST\",\"LMTEXH\",\"OUTFM\",\"OUTTECH\",\"OTHR\"]}],\"doc\":\"ORK-107\",\"default\":null},{\"name\":\"PTT_EXMPT_REASON\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"PTT_EXMPT_REASONS\",\"symbols\":[\"PORTF\",\"PCKGTRX\",\"ESCB\"]}],\"doc\":\"ORK-108\",\"default\":null},{\"name\":\"SPREAD\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-111\",\"default\":null},{\"name\":\"XCHANGE_RATE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-112\",\"default\":null},{\"name\":\"REF_PRICE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-113\",\"default\":null},{\"name\":\"PAY_NOTIONAL\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-114\",\"default\":null},{\"name\":\"RCV_NOTIONAL\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-115\",\"default\":null},{\"name\":\"PAY_NOTIONAL_CURRENCY\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-116\",\"default\":null},{\"name\":\"RCV_NOTIONAL_CURRENCY\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-117\",\"default\":null},{\"name\":\"REPO_RATE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-118\",\"default\":null},{\"name\":\"STRIKE_PRICE_PEND\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-119\",\"default\":null},{\"name\":\"STRIKE_PRICE_NOTATION\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"STRIKE_PRICE_NOTATION_TYPES\",\"symbols\":[\"MONE\",\"YIEL\",\"PERC\"]}}],\"doc\":\"ORK-120 Each value is VARCHAR(4), max. 1000 values.\",\"default\":null},{\"name\":\"EXCH_SEQ_NR\",\"type\":[\"null\",\"int\"],\"doc\":\"ORK-121\",\"default\":null},{\"name\":\"QUOTE_ACCEPT_TIME\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-122\",\"default\":null},{\"name\":\"COUNTERPARTY_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-123 Datatype: VARCHAR(20)\",\"default\":null},{\"name\":\"COUNTERPARTY_ID_TYPE\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"COUNTERPARTY_ID_TYPES\",\"symbols\":[\"COKIS\",\"BPKN\",\"ISIS\",\"DPTNR\",\"LEI\"]}],\"doc\":\"ORK-124 Datatype: VARCHAR(5)\",\"default\":null},{\"name\":\"EXEC_ID_INT\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-125 Datatype: VARCHAR(5)\",\"default\":null}]}")
}