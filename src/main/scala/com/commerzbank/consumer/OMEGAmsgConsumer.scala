package com.commerzbank.consumer

import java.util.Properties

import com.commerzbank.domain.omega.{OMEGAmsg, ORDER_EVNT_CODE_TYPES}
import kafka.consumer.{Consumer, ConsumerConfig, ConsumerTimeoutException, Whitelist}
import kafka.serializer.DefaultDecoder
import org.apache.avro.Schema
import org.apache.avro.generic.{GenericDatumReader, GenericRecord}
import org.apache.avro.io.{DatumReader, Decoder, DecoderFactory}
import org.apache.avro.specific.SpecificDatumReader

import scala.io.Source


class OMEGAmsgConsumer() {
  private val props = new Properties()

  val groupId = "demo-topic-consumer"
  val topic = "ptr.orders"

  props.put("group.id", groupId)
  props.put("zookeeper.connect", "bdmstd001.zit.commerzbank.com:2181")
  props.put("auto.offset.reset", "smallest")
  props.put("consumer.timeout.ms", "120000")
  props.put("auto.commit.interval.ms", "10000")

  private val consumerConfig = new ConsumerConfig(props)
  private val consumerConnector = Consumer.create(consumerConfig)
  private val filterSpec = new Whitelist(topic)
  private val streams = consumerConnector.createMessageStreamsByFilter(filterSpec, 1, new DefaultDecoder(), new DefaultDecoder())(0)

  lazy val iterator = streams.iterator()

  private val schemaString = Source.fromURL(getClass.getResource("/omega_schema.avsc")).mkString
  private val schema: Schema = new Schema.Parser().parse(schemaString)

//  private def getMessage(message: Array[Byte]): Option[OMEGAmsg] = {
//
//    // Deserialize and create generic record
//    val reader: DatumReader[GenericRecord] = new GenericDatumReader[GenericRecord](schema)
//    val decoder: Decoder = DecoderFactory.get().binaryDecoder(message, null)
//    val msgData: GenericRecord = reader.read(null, decoder)
//
//    def byteArrayToDouble(x:Array[Byte]) = java.nio.ByteBuffer.wrap(x).getDouble
//    def doubleToByteArray(x: Double) = java.nio.ByteBuffer.allocate(8).putLong(java.lang.Double.doubleToLongBits(x)).array
//
//    // Make msg object
//    val msg = OMEGAmsg(
//      schema_name = msgData.get("schema_name").toString
//      , schema_version = msgData.get("schema_version").toString.toInt
//      , time = msgData.get("time").toString.toLong
//      , message_uid = msgData.get("message_uid").toString
//      , source = msgData.get("source").toString
//      , ORDER_EVNT_CODE = ORDER_EVNT_CODE_TYPES.withName(msgData.get("ORDER_EVNT_CODE").toString)
//      , PRICE = Option(msgData.get("PRICE").toString.toDouble)
//    )
//    Some(msg)
//  }

  private def deserialize(message: Array[Byte]): Option[OMEGAmsg] = {
    val reader = new SpecificDatumReader[OMEGAmsg](schema)
    val decoder = DecoderFactory.get().binaryDecoder(message, null)
    val data = reader.read(null, decoder)
    Some(data)
  }

  /**
    * Read message from kafka queue
    *
    * @return Some of message if exist in kafka queue, otherwise None
    */
  def read() =
    try {
      if (hasNext) {
        println("Getting message from queue.............")
        val message: Array[Byte] = iterator.next().message()
//        getMessage(message)
        deserialize(message)
      } else {
        None
      }
    } catch {
      case ex: Exception => ex.printStackTrace()
        None
    }

  private def hasNext: Boolean =
    try
      iterator.hasNext()
    catch {
      case timeOutEx: ConsumerTimeoutException =>
        false
      case ex: Exception => ex.printStackTrace()
        println("Got error when reading message ")
        false
    }

  def close(): Unit = consumerConnector.shutdown()

}

object OMEGAmsgConsumerApp extends App {

  val consumer = new OMEGAmsgConsumer()

  while (true) {
    consumer.read() match {
      case Some(message) =>
        println("Got message: " + message)

        Thread.sleep(100)
      case _ =>
        println("Queue is empty.......................  ")
        // wait for 2 second
        Thread.sleep(2 * 1000)
    }
  }

}