package com.commerzbank.producer

import java.io.ByteArrayOutputStream
import java.util.{Properties, UUID}

import com.commerzbank.domain.User
import kafka.producer.{KeyedMessage, Producer, ProducerConfig}
import org.apache.avro.Schema
import org.apache.avro.generic.{GenericData, GenericRecord}
import org.apache.avro.io._
import org.apache.avro.specific.SpecificDatumWriter
import org.apache.log4j.BasicConfigurator
import org.slf4j.LoggerFactory

import scala.io.Source

class KafkaProducer() {

  private val props = new Properties()

  //  0, which means that the producer never waits for an acknowledgement from the broker
  //  1, which means that the producer gets an acknowledgement after the leader replica has received the data
  //  -1, which means that the producer gets an acknowledgement after all in-sync replicas have received the data
  props.put("metadata.broker.list", "bdmstd001.zit.commerzbank.com:6667")
  props.put("message.send.max.retries", "5")
  props.put("request.required.acks", "0")
  props.put("serializer.class", "kafka.serializer.DefaultEncoder")
  props.put("client.id", UUID.randomUUID().toString())

  private val producer = new Producer[String, Array[Byte]](new ProducerConfig(props))

  //Read avro schema file and
  val schemaString = Source.fromURL(getClass.getResource("/user_schema.avsc")).mkString
  val schema: Schema = new Schema.Parser().parse(schemaString)

  def send(topic: String, users: List[User]): Unit = {
    val genericUser: GenericRecord = new GenericData.Record(schema)
    try {
      val queueMessages = users.map { user =>
        // Create avro generic record object
        //Put data in that generic record object
        genericUser.put("id", user.id)
        genericUser.put("name", user.name)
        genericUser.put("email", user.email.orNull)

        // Serialize generic record object into byte array
        val writer = new SpecificDatumWriter[GenericRecord](schema)
        val out = new ByteArrayOutputStream()
        val encoder: BinaryEncoder = EncoderFactory.get().binaryEncoder(out, null)
        writer.write(genericUser, encoder)
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

object ProducerApp extends App {
  BasicConfigurator.configure()
  val log = LoggerFactory.getLogger(getClass)

  log.info("Start of the sample Application")

  private val topic = "demo.topic"

  val producer = new KafkaProducer()

  val user1 = User(1, "Sushil Singh", None)
  val user2 = User(2, "Satendra Kumar Yadav", Some("satendra@knoldus.com"))

  producer.send(topic, List(user1, user2))

}