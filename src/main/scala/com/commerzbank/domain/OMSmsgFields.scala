/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package com.commerzbank.domain

import scala.annotation.switch

/**
 * This OMS message includes all ORK fields needed for PTR. Use the builder to produce the object and set defaults like schema name and version.
 * @param schema_name Displays the avro schema name used. PTR-001
 * @param schema_version Incremental integer that displays the avro schema version used. PTR-002
 * @param time The time of message creation. PTR-003
 * @param message_uid An ID that is globally unique within the sending OMS. Used as PK in PTR! PTR-004 Datatype: VARCHAR(100)
 * @param source The OMS providing the Message. Used as PK in PTR! PTR-005 Datatype: VARCHAR(10)
 * @param PENDING_ALLOC_IND ORK-004
 * @param CLNT_INT_ID ORK-005 Datatype: VARCHAR(50)
 * @param CLNT_INT_ID_TYPE ORK-006
 * @param BUY_SELL_OMS ORK-010
 * @param FIN_INSTR_ID_INT ORK-012 Datatype: VARCHAR(16)
 * @param FIN_INSTR_ID_INT_TYPE ORK-013
 * @param PRICE ORK-014
 * @param PRICE_NOTATION ORK-016
 * @param PRICE_MULTIPLIER ORK-017
 * @param PRICE_CURRENCY ORK-018 Datatype: VARCHAR(3)
 * @param CURR_CODE_LEG2 ORK-019 Datatype: VARCHAR(3)
 * @param OPTION_TYPE_OMS ORK-021
 * @param STRIKE_PRICE ORK-022 max. 1000 values.
 * @param STRIKE_PRICE_CURRENCY ORK-023 Each value is VARCHAR(3), max. 1000 values.
 * @param UP_FRONT_PAYMENT ORK-024
 * @param STTLM_DELIVERY_TYPE ORK-025
 * @param OPTION_EXERCISE_STYLE ORK-026
 * @param MATURITY_DATE ORK-027
 * @param EXPIRY_DATE ORK-028
 * @param QTY_CURRENCY ORK-029 Datatype: VARCHAR(3)
 * @param QTY_NOTATION ORK-030
 * @param INITIAL_QUANTITY ORK-031
 * @param DIRECTED_ORDER_IND ORK-033
 * @param TRADING_CAPACITY_IND ORK-034
 * @param LIQ_PROV_ACTIVITY ORK-035
 * @param ORD_ID_EXT ORK-036 Datatype: VARCHAR(50) ORK-36 or 38 have to be provided in every message.
 * @param ORD_ID_EXT_TYPE ORK-037
 * @param ORDER_ID_INT ORK-038 Datatype: VARCHAR(50) ORK-36 or 38 have to be provided in every message.
 * @param VENUE_MIC ORK-041 Datatype: VARCHAR(4)
 * @param ORDER_TYPE ORK-043 Datatype: VARCHAR(50)
 * @param LIMIT_PRICE ORK-044
 * @param ADDTL_LIMIT_PRICE ORK-045
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
 * @param TRADING_VENUE_TRX_ID ORK-068 Datatype: VARCHAR(52)
 * @param VALIDITY_PERIOD_IND ORK-069
 * @param ORDER_RESTRICTION ORK-070
 * @param VALIDITY_PERIOD_END_DATE ORK-071
 * @param AGG_ORDER_IND ORK-072
 * @param SEND_ENTITY_ID ORK-079 Datatype: VARCHAR(20)
 * @param SEND_ENTITY_ID_TYPE ORK-080
 * @param UNDL_INSTR_ID ORK-085 Datatype: VARCHAR(20000)
 * @param UNDL_INSTR_ID_TYPE ORK-086 Datatype: VARCHAR(20000)
 * @param PASSV_AGGR_IND ORK-088 Datatype: VARCHAR(4)
 * @param EXEC_WITHIN_FIRM ORK-096 Datatype: VARCHAR(50)
 * @param PRODUCT_DESC ORK-097 Datatype: VARCHAR(280)
 * @param CONTRACT_ID ORK-098 Datatype: VARCHAR(140)
 * @param CURRENCY_PAIR ORK-099 Datatype: VARCHAR(20)
 * @param INVEST_DECISION_WITHIN_FIRM ORK-102 Datatype: VARCHAR(10)
 * @param COUNTRY_WHERE_ORD_RECEIVED ORK-103 Datatype: VARCHAR(2)
 * @param ACT_ON_BEHALF_CLIENT_ID ORK-104 Datatype: VARCHAR(20)
 * @param ACT_ON_BEHALF_CLIENT_ID_TYPE ORK-105
 * @param QUOTE_VALID_UNTIL ORK-106
 * @param QUOTE_CXL_REASON ORK-107
 * @param PTT_EXMPT_REASON ORK-108
 * @param SPREAD ORK-111
 * @param XCHANGE_RATE ORK-112
 * @param REF_PRICE ORK-113
 * @param PAY_NOTIONAL ORK-114
 * @param RCV_NOTIONAL ORK-115
 * @param PAY_NOTIONAL_CURRENCY ORK-116 Datatype: VARCHAR(3)
 * @param RCV_NOTIONAL_CURRENCY ORK-117 Datatype: VARCHAR(3)
 * @param REPO_RATE ORK-118
 * @param STRIKE_PRICE_PEND ORK-119
 * @param STRIKE_PRICE_NOTATION ORK-120 Each value is VARCHAR(4), max. 1000 values.
 * @param EXCH_SEQ_NR ORK-121
 * @param QUOTE_ACCEPT_TIME ORK-122
 * @param COUNTERPARTY_ID ORK-123 Datatype: VARCHAR(20)
 * @param COUNTERPARTY_ID_TYPE ORK-124 Datatype: VARCHAR(5)
 * @param EXEC_ID_INT ORK-125 Datatype: VARCHAR(5)
 * @param SHORTCODE_CLIENT SCD-001 Datatype: VARCHAR(20)
 * @param SHORTCODE_IDM SCD-002 Datatype: VARCHAR(20)
 * @param SHORTCODE_EDM SCD-003 Datatype: VARCHAR(20)
 */
case class OMSmsgFields(var schema_name: String = "OMSmsgFields", var schema_version: Int = 100, var time: Long, var message_uid: String, var source: String, var PENDING_ALLOC_IND: Option[Boolean] = None, var CLNT_INT_ID: Option[String] = None, var CLNT_INT_ID_TYPE: Option[CLNT_INT_ID_TYPES] = None, var BUY_SELL_OMS: Option[BUY_SELL_OMSS] = None, var FIN_INSTR_ID_INT: Option[String] = None, var FIN_INSTR_ID_INT_TYPE: Option[FIN_INSTR_ID_INT_TYPES] = None, var PRICE: Option[Array[Byte]] = None, var PRICE_NOTATION: Option[PRICE_NOTATION_TYPES] = None, var PRICE_MULTIPLIER: Option[Array[Byte]] = None, var PRICE_CURRENCY: Option[String] = None, var CURR_CODE_LEG2: Option[String] = None, var OPTION_TYPE_OMS: Option[OPTION_TYPES_OMS] = None, var STRIKE_PRICE: Option[List[Array[Byte]]] = None, var STRIKE_PRICE_CURRENCY: Option[List[String]] = None, var UP_FRONT_PAYMENT: Option[Array[Byte]] = None, var STTLM_DELIVERY_TYPE: Option[STTLM_DELIVERY_TYPES] = None, var OPTION_EXERCISE_STYLE: Option[OPTION_EXERCISE_STYLES] = None, var MATURITY_DATE: Option[Long] = None, var EXPIRY_DATE: Option[Long] = None, var QTY_CURRENCY: Option[String] = None, var QTY_NOTATION: Option[QTY_NOTATION_TYPES] = None, var INITIAL_QUANTITY: Option[Array[Byte]] = None, var DIRECTED_ORDER_IND: Option[Boolean] = None, var TRADING_CAPACITY_IND: Option[TRADING_CAPACITY_INDS] = None, var LIQ_PROV_ACTIVITY: Option[Boolean] = None, var ORD_ID_EXT: Option[String] = None, var ORD_ID_EXT_TYPE: Option[ORD_ID_EXT_TYPES] = None, var ORDER_ID_INT: Option[String] = None, var VENUE_MIC: Option[String] = None, var ORDER_TYPE: Option[String] = None, var LIMIT_PRICE: Option[Array[Byte]] = None, var ADDTL_LIMIT_PRICE: Option[Array[Byte]] = None, var STOP_PRICE: Option[Array[Byte]] = None, var PEGGED_LIMIT_PRICE: Option[Array[Byte]] = None, var REMAINING_QUANTITY: Option[Array[Byte]] = None, var DISPL_QUANTITY: Option[Array[Byte]] = None, var TRADED_QUANTITY: Option[Array[Byte]] = None, var MAQ: Option[Array[Byte]] = None, var MES: Option[Array[Byte]] = None, var MES_FIRST_EXEC_ONLY_IND: Option[Boolean] = None, var SELF_EXEC_PREVENT_IND: Option[Boolean] = None, var ORDER_SUBM_TS: Option[Long] = None, var ORDER_ENTRY_TS: Option[Long] = None, var EXECUTION_TS: Option[Long] = None, var ORDER_EVNT_CODE: ORDER_EVNT_CODE_TYPES, var ORDER_ACTN: Option[ORDER_ACTN_TYPES] = None, var SHORT_SELLING_IND: Option[SHORT_SELLING_INDS] = None, var WAIVER_IND: Option[List[WAIVER_IND_TYPES]] = None, var TRADING_VENUE_TRX_ID: Option[String] = None, var VALIDITY_PERIOD_IND: Option[VALIDITY_PERIOD_INDS] = None, var ORDER_RESTRICTION: Option[ORDER_RESTRICTION_TYPES] = None, var VALIDITY_PERIOD_END_DATE: Option[Long] = None, var AGG_ORDER_IND: Option[Boolean] = None, var SEND_ENTITY_ID: Option[String] = None, var SEND_ENTITY_ID_TYPE: Option[SEND_ENTITY_ID_TYPES] = None, var UNDL_INSTR_ID: Option[List[String]] = None, var UNDL_INSTR_ID_TYPE: Option[List[UNDL_INSTR_ID_TYPES]] = None, var PASSV_AGGR_IND: Option[PASSV_AGGR_INDS] = None, var EXEC_WITHIN_FIRM: Option[String] = None, var PRODUCT_DESC: Option[String] = None, var CONTRACT_ID: Option[String] = None, var CURRENCY_PAIR: Option[String] = None, var INVEST_DECISION_WITHIN_FIRM: Option[String] = None, var COUNTRY_WHERE_ORD_RECEIVED: Option[String] = None, var ACT_ON_BEHALF_CLIENT_ID: Option[String] = None, var ACT_ON_BEHALF_CLIENT_ID_TYPE: Option[ACT_ON_BEHALF_CLIENT_ID_TYPES] = None, var QUOTE_VALID_UNTIL: Option[Long] = None, var QUOTE_CXL_REASON: Option[QUOTE_CXL_REASONS] = None, var PTT_EXMPT_REASON: Option[PTT_EXMPT_REASONS] = None, var SPREAD: Option[Array[Byte]] = None, var XCHANGE_RATE: Option[Array[Byte]] = None, var REF_PRICE: Option[Array[Byte]] = None, var PAY_NOTIONAL: Option[Array[Byte]] = None, var RCV_NOTIONAL: Option[Array[Byte]] = None, var PAY_NOTIONAL_CURRENCY: Option[String] = None, var RCV_NOTIONAL_CURRENCY: Option[String] = None, var REPO_RATE: Option[Array[Byte]] = None, var STRIKE_PRICE_PEND: Option[Boolean] = None, var STRIKE_PRICE_NOTATION: Option[List[STRIKE_PRICE_NOTATION_TYPES]] = None, var EXCH_SEQ_NR: Option[Int] = None, var QUOTE_ACCEPT_TIME: Option[Long] = None, var COUNTERPARTY_ID: Option[String] = None, var COUNTERPARTY_ID_TYPE: Option[COUNTERPARTY_ID_TYPES] = None, var EXEC_ID_INT: Option[String] = None, var SHORTCODE_CLIENT: Option[String] = None, var SHORTCODE_IDM: Option[String] = None, var SHORTCODE_EDM: Option[String] = None) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this("OMSmsgFields", 100, 0L, "", "", None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, null, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
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
        CLNT_INT_ID match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 7 => {
        CLNT_INT_ID_TYPE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 8 => {
        BUY_SELL_OMS match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 9 => {
        FIN_INSTR_ID_INT match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 10 => {
        FIN_INSTR_ID_INT_TYPE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 11 => {
        PRICE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 12 => {
        PRICE_NOTATION match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 13 => {
        PRICE_MULTIPLIER match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 14 => {
        PRICE_CURRENCY match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 15 => {
        CURR_CODE_LEG2 match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 16 => {
        OPTION_TYPE_OMS match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 17 => {
        STRIKE_PRICE match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              java.nio.ByteBuffer.wrap(x)
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 18 => {
        STRIKE_PRICE_CURRENCY match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              x
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 19 => {
        UP_FRONT_PAYMENT match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 20 => {
        STTLM_DELIVERY_TYPE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 21 => {
        OPTION_EXERCISE_STYLE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 22 => {
        MATURITY_DATE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 23 => {
        EXPIRY_DATE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 24 => {
        QTY_CURRENCY match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 25 => {
        QTY_NOTATION match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 26 => {
        INITIAL_QUANTITY match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 27 => {
        DIRECTED_ORDER_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 28 => {
        TRADING_CAPACITY_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 29 => {
        LIQ_PROV_ACTIVITY match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 30 => {
        ORD_ID_EXT match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 31 => {
        ORD_ID_EXT_TYPE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 32 => {
        ORDER_ID_INT match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 33 => {
        VENUE_MIC match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 34 => {
        ORDER_TYPE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 35 => {
        LIMIT_PRICE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 36 => {
        ADDTL_LIMIT_PRICE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 37 => {
        STOP_PRICE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 38 => {
        PEGGED_LIMIT_PRICE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 39 => {
        REMAINING_QUANTITY match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 40 => {
        DISPL_QUANTITY match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 41 => {
        TRADED_QUANTITY match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 42 => {
        MAQ match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 43 => {
        MES match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 44 => {
        MES_FIRST_EXEC_ONLY_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 45 => {
        SELF_EXEC_PREVENT_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 46 => {
        ORDER_SUBM_TS match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 47 => {
        ORDER_ENTRY_TS match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 48 => {
        EXECUTION_TS match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 49 => {
        ORDER_EVNT_CODE
      }.asInstanceOf[AnyRef]
      case 50 => {
        ORDER_ACTN match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 51 => {
        SHORT_SELLING_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 52 => {
        WAIVER_IND match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              x
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 53 => {
        TRADING_VENUE_TRX_ID match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 54 => {
        VALIDITY_PERIOD_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 55 => {
        ORDER_RESTRICTION match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 56 => {
        VALIDITY_PERIOD_END_DATE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 57 => {
        AGG_ORDER_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 58 => {
        SEND_ENTITY_ID match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 59 => {
        SEND_ENTITY_ID_TYPE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 60 => {
        UNDL_INSTR_ID match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              x
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 61 => {
        UNDL_INSTR_ID_TYPE match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              x
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 62 => {
        PASSV_AGGR_IND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 63 => {
        EXEC_WITHIN_FIRM match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 64 => {
        PRODUCT_DESC match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 65 => {
        CONTRACT_ID match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 66 => {
        CURRENCY_PAIR match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 67 => {
        INVEST_DECISION_WITHIN_FIRM match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 68 => {
        COUNTRY_WHERE_ORD_RECEIVED match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 69 => {
        ACT_ON_BEHALF_CLIENT_ID match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 70 => {
        ACT_ON_BEHALF_CLIENT_ID_TYPE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 71 => {
        QUOTE_VALID_UNTIL match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 72 => {
        QUOTE_CXL_REASON match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 73 => {
        PTT_EXMPT_REASON match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 74 => {
        SPREAD match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 75 => {
        XCHANGE_RATE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 76 => {
        REF_PRICE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 77 => {
        PAY_NOTIONAL match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 78 => {
        RCV_NOTIONAL match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 79 => {
        PAY_NOTIONAL_CURRENCY match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 80 => {
        RCV_NOTIONAL_CURRENCY match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 81 => {
        REPO_RATE match {
          case Some(x) => java.nio.ByteBuffer.wrap(x)
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 82 => {
        STRIKE_PRICE_PEND match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 83 => {
        STRIKE_PRICE_NOTATION match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              x
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 84 => {
        EXCH_SEQ_NR match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 85 => {
        QUOTE_ACCEPT_TIME match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 86 => {
        COUNTERPARTY_ID match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 87 => {
        COUNTERPARTY_ID_TYPE match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 88 => {
        EXEC_ID_INT match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 89 => {
        SHORTCODE_CLIENT match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 90 => {
        SHORTCODE_IDM match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 91 => {
        SHORTCODE_EDM match {
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
      case 6 => this.CLNT_INT_ID = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 7 => this.CLNT_INT_ID_TYPE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[CLNT_INT_ID_TYPES]]
      case 8 => this.BUY_SELL_OMS = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[BUY_SELL_OMSS]]
      case 9 => this.FIN_INSTR_ID_INT = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 10 => this.FIN_INSTR_ID_INT_TYPE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[FIN_INSTR_ID_INT_TYPES]]
      case 11 => this.PRICE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 12 => this.PRICE_NOTATION = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[PRICE_NOTATION_TYPES]]
      case 13 => this.PRICE_MULTIPLIER = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 14 => this.PRICE_CURRENCY = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 15 => this.CURR_CODE_LEG2 = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 16 => this.OPTION_TYPE_OMS = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[OPTION_TYPES_OMS]]
      case 17 => this.STRIKE_PRICE = {
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
      case 18 => this.STRIKE_PRICE_CURRENCY = {
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
      case 19 => this.UP_FRONT_PAYMENT = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 20 => this.STTLM_DELIVERY_TYPE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[STTLM_DELIVERY_TYPES]]
      case 21 => this.OPTION_EXERCISE_STYLE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[OPTION_EXERCISE_STYLES]]
      case 22 => this.MATURITY_DATE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 23 => this.EXPIRY_DATE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 24 => this.QTY_CURRENCY = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 25 => this.QTY_NOTATION = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[QTY_NOTATION_TYPES]]
      case 26 => this.INITIAL_QUANTITY = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 27 => this.DIRECTED_ORDER_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 28 => this.TRADING_CAPACITY_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[TRADING_CAPACITY_INDS]]
      case 29 => this.LIQ_PROV_ACTIVITY = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 30 => this.ORD_ID_EXT = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 31 => this.ORD_ID_EXT_TYPE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[ORD_ID_EXT_TYPES]]
      case 32 => this.ORDER_ID_INT = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 33 => this.VENUE_MIC = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 34 => this.ORDER_TYPE = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 35 => this.LIMIT_PRICE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 36 => this.ADDTL_LIMIT_PRICE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 37 => this.STOP_PRICE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 38 => this.PEGGED_LIMIT_PRICE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 39 => this.REMAINING_QUANTITY = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 40 => this.DISPL_QUANTITY = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 41 => this.TRADED_QUANTITY = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 42 => this.MAQ = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 43 => this.MES = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 44 => this.MES_FIRST_EXEC_ONLY_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 45 => this.SELF_EXEC_PREVENT_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 46 => this.ORDER_SUBM_TS = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 47 => this.ORDER_ENTRY_TS = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 48 => this.EXECUTION_TS = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 49 => this.ORDER_EVNT_CODE = {
        value
      }.asInstanceOf[ORDER_EVNT_CODE_TYPES]
      case 50 => this.ORDER_ACTN = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[ORDER_ACTN_TYPES]]
      case 51 => this.SHORT_SELLING_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[SHORT_SELLING_INDS]]
      case 52 => this.WAIVER_IND = {
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
      case 53 => this.TRADING_VENUE_TRX_ID = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 54 => this.VALIDITY_PERIOD_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[VALIDITY_PERIOD_INDS]]
      case 55 => this.ORDER_RESTRICTION = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[ORDER_RESTRICTION_TYPES]]
      case 56 => this.VALIDITY_PERIOD_END_DATE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 57 => this.AGG_ORDER_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 58 => this.SEND_ENTITY_ID = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 59 => this.SEND_ENTITY_ID_TYPE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[SEND_ENTITY_ID_TYPES]]
      case 60 => this.UNDL_INSTR_ID = {
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
      case 61 => this.UNDL_INSTR_ID_TYPE = {
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
      }.asInstanceOf[Option[List[UNDL_INSTR_ID_TYPES]]]
      case 62 => this.PASSV_AGGR_IND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[PASSV_AGGR_INDS]]
      case 63 => this.EXEC_WITHIN_FIRM = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 64 => this.PRODUCT_DESC = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 65 => this.CONTRACT_ID = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 66 => this.CURRENCY_PAIR = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 67 => this.INVEST_DECISION_WITHIN_FIRM = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 68 => this.COUNTRY_WHERE_ORD_RECEIVED = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 69 => this.ACT_ON_BEHALF_CLIENT_ID = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 70 => this.ACT_ON_BEHALF_CLIENT_ID_TYPE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[ACT_ON_BEHALF_CLIENT_ID_TYPES]]
      case 71 => this.QUOTE_VALID_UNTIL = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 72 => this.QUOTE_CXL_REASON = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[QUOTE_CXL_REASONS]]
      case 73 => this.PTT_EXMPT_REASON = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[PTT_EXMPT_REASONS]]
      case 74 => this.SPREAD = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 75 => this.XCHANGE_RATE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 76 => this.REF_PRICE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 77 => this.PAY_NOTIONAL = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 78 => this.RCV_NOTIONAL = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 79 => this.PAY_NOTIONAL_CURRENCY = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 80 => this.RCV_NOTIONAL_CURRENCY = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 81 => this.REPO_RATE = {
        value match {
          case null => None
          case _ => Some(value match {
            case (buffer: java.nio.ByteBuffer) => {
              buffer.array()
            }
          })
        }
      }.asInstanceOf[Option[Array[Byte]]]
      case 82 => this.STRIKE_PRICE_PEND = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 83 => this.STRIKE_PRICE_NOTATION = {
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
      case 84 => this.EXCH_SEQ_NR = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Int]]
      case 85 => this.QUOTE_ACCEPT_TIME = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 86 => this.COUNTERPARTY_ID = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 87 => this.COUNTERPARTY_ID_TYPE = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[COUNTERPARTY_ID_TYPES]]
      case 88 => this.EXEC_ID_INT = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 89 => this.SHORTCODE_CLIENT = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 90 => this.SHORTCODE_IDM = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 91 => this.SHORTCODE_EDM = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = OMSmsgFields.SCHEMA$
}

object OMSmsgFields {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OMSmsgFields\",\"namespace\":\"com.commerzbank.domain\",\"doc\":\"This OMS message includes all ORK fields needed for PTR. Use the builder to produce the object and set defaults like schema name and version.\",\"fields\":[{\"name\":\"schema_name\",\"type\":\"string\",\"doc\":\"Displays the avro schema name used. PTR-001\",\"default\":\"OMSmsgFields\"},{\"name\":\"schema_version\",\"type\":\"int\",\"doc\":\"Incremental integer that displays the avro schema version used. PTR-002\",\"default\":100},{\"name\":\"time\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"},\"doc\":\"The time of message creation. PTR-003\"},{\"name\":\"message_uid\",\"type\":\"string\",\"doc\":\"An ID that is globally unique within the sending OMS. Used as PK in PTR! PTR-004 Datatype: VARCHAR(100)\"},{\"name\":\"source\",\"type\":\"string\",\"doc\":\"The OMS providing the Message. Used as PK in PTR! PTR-005 Datatype: VARCHAR(10)\"},{\"name\":\"PENDING_ALLOC_IND\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-004\",\"default\":null},{\"name\":\"CLNT_INT_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-005 Datatype: VARCHAR(50)\",\"default\":null},{\"name\":\"CLNT_INT_ID_TYPE\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"CLNT_INT_ID_TYPES\",\"symbols\":[\"COKIS\",\"BPKN\",\"ISIS\",\"LEI\",\"DPTNR\"]}],\"doc\":\"ORK-006\",\"default\":null},{\"name\":\"BUY_SELL_OMS\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"BUY_SELL_OMSS\",\"symbols\":[\"BUYI\",\"SELL\",\"EXERCISEOPT\",\"RCVPREM\",\"RCVSECAMT\",\"PAYSECAMT\",\"PAYFIXRATE\",\"RCVFIXRATE\",\"PAYSPREAD\",\"RCVSPREAD\",\"RCVCCY\",\"PAYCCY\",\"RCVDIV\",\"PAYDIV\",\"BUYPROT\",\"SELLPROT\",\"RCVCMDTY\",\"DELCMDTY\"]}],\"doc\":\"ORK-010\",\"default\":null},{\"name\":\"FIN_INSTR_ID_INT\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-012 Datatype: VARCHAR(16)\",\"default\":null},{\"name\":\"FIN_INSTR_ID_INT_TYPE\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"FIN_INSTR_ID_INT_TYPES\",\"symbols\":[\"ISIN\",\"WPKN\",\"CUSIP\",\"IDDS\",\"INTID\",\"SEDOL\",\"RIC\",\"RED\",\"BBG\",\"EXTS\"]}],\"doc\":\"ORK-013\",\"default\":null},{\"name\":\"PRICE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-014\",\"default\":null},{\"name\":\"PRICE_NOTATION\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"PRICE_NOTATION_TYPES\",\"symbols\":[\"MONE\",\"PERC\",\"YIEL\",\"BAPO\"]}],\"doc\":\"ORK-016\",\"default\":null},{\"name\":\"PRICE_MULTIPLIER\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-017\",\"default\":null},{\"name\":\"PRICE_CURRENCY\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-018 Datatype: VARCHAR(3)\",\"default\":null},{\"name\":\"CURR_CODE_LEG2\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-019 Datatype: VARCHAR(3)\",\"default\":null},{\"name\":\"OPTION_TYPE_OMS\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"OPTION_TYPES_OMS\",\"symbols\":[\"CALL\",\"PUTO\",\"OTHR\",\"CAP\",\"FLOOR\"]}],\"doc\":\"ORK-021\",\"default\":null},{\"name\":\"STRIKE_PRICE\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}}],\"doc\":\"ORK-022 max. 1000 values.\",\"default\":null},{\"name\":\"STRIKE_PRICE_CURRENCY\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"ORK-023 Each value is VARCHAR(3), max. 1000 values.\",\"default\":null},{\"name\":\"UP_FRONT_PAYMENT\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-024\",\"default\":null},{\"name\":\"STTLM_DELIVERY_TYPE\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"STTLM_DELIVERY_TYPES\",\"symbols\":[\"PHYS\",\"CASH\",\"OPTL\"]}],\"doc\":\"ORK-025\",\"default\":null},{\"name\":\"OPTION_EXERCISE_STYLE\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"OPTION_EXERCISE_STYLES\",\"symbols\":[\"EURO\",\"AMER\",\"ASIA\",\"BERM\",\"OTHR\"]}],\"doc\":\"ORK-026\",\"default\":null},{\"name\":\"MATURITY_DATE\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-027\",\"default\":null},{\"name\":\"EXPIRY_DATE\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-028\",\"default\":null},{\"name\":\"QTY_CURRENCY\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-029 Datatype: VARCHAR(3)\",\"default\":null},{\"name\":\"QTY_NOTATION\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"QTY_NOTATION_TYPES\",\"symbols\":[\"UNIT\",\"NOML\",\"MONE\"]}],\"doc\":\"ORK-030\",\"default\":null},{\"name\":\"INITIAL_QUANTITY\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-031\",\"default\":null},{\"name\":\"DIRECTED_ORDER_IND\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-033\",\"default\":null},{\"name\":\"TRADING_CAPACITY_IND\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TRADING_CAPACITY_INDS\",\"symbols\":[\"DEAL\",\"MTCH\",\"AOTC\"]}],\"doc\":\"ORK-034\",\"default\":null},{\"name\":\"LIQ_PROV_ACTIVITY\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-035\",\"default\":null},{\"name\":\"ORD_ID_EXT\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-036 Datatype: VARCHAR(50) ORK-36 or 38 have to be provided in every message.\",\"default\":null},{\"name\":\"ORD_ID_EXT_TYPE\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ORD_ID_EXT_TYPES\",\"symbols\":[\"TRDVN\",\"BROK\",\"CLNT\"]}],\"doc\":\"ORK-037\",\"default\":null},{\"name\":\"ORDER_ID_INT\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-038 Datatype: VARCHAR(50) ORK-36 or 38 have to be provided in every message.\",\"default\":null},{\"name\":\"VENUE_MIC\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-041 Datatype: VARCHAR(4)\",\"default\":null},{\"name\":\"ORDER_TYPE\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-043 Datatype: VARCHAR(50)\",\"default\":null},{\"name\":\"LIMIT_PRICE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-044\",\"default\":null},{\"name\":\"ADDTL_LIMIT_PRICE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-045\",\"default\":null},{\"name\":\"STOP_PRICE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-046\",\"default\":null},{\"name\":\"PEGGED_LIMIT_PRICE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-047\",\"default\":null},{\"name\":\"REMAINING_QUANTITY\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-048\",\"default\":null},{\"name\":\"DISPL_QUANTITY\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-049\",\"default\":null},{\"name\":\"TRADED_QUANTITY\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-050\",\"default\":null},{\"name\":\"MAQ\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-051\",\"default\":null},{\"name\":\"MES\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-052\",\"default\":null},{\"name\":\"MES_FIRST_EXEC_ONLY_IND\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-053\",\"default\":null},{\"name\":\"SELF_EXEC_PREVENT_IND\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-055\",\"default\":null},{\"name\":\"ORDER_SUBM_TS\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-056\",\"default\":null},{\"name\":\"ORDER_ENTRY_TS\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-058\",\"default\":null},{\"name\":\"EXECUTION_TS\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-059\",\"default\":null},{\"name\":\"ORDER_EVNT_CODE\",\"type\":{\"type\":\"enum\",\"name\":\"ORDER_EVNT_CODE_TYPES\",\"symbols\":[\"RFQ\",\"QUOT\",\"INCOR\",\"OUTOR\",\"EXCOR\"]},\"doc\":\"ORK-061\"},{\"name\":\"ORDER_ACTN\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ORDER_ACTN_TYPES\",\"symbols\":[\"NEWO\",\"CANCL\",\"RJCT\",\"TRIG\",\"REME\",\"REMA\",\"REMH\",\"CHME\",\"CHMO\",\"CAME\",\"CAMO\",\"EXPI\",\"PARF\",\"FILL\",\"INACT\",\"REMO\",\"CACL\",\"RJTCL\",\"CAEXC\"]}],\"doc\":\"ORK-063\",\"default\":null},{\"name\":\"SHORT_SELLING_IND\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"SHORT_SELLING_INDS\",\"symbols\":[\"SSHO\",\"SSEX\",\"SELL\",\"UNDI\"]}],\"doc\":\"ORK-064\",\"default\":null},{\"name\":\"WAIVER_IND\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"WAIVER_IND_TYPES\",\"symbols\":[\"LRGS\",\"RFPT\",\"NLIQ\",\"OILQ\",\"PRIC\",\"SIZE\",\"ILQD\",\"ESCB\"]}}],\"doc\":\"ORK-065\",\"default\":null},{\"name\":\"TRADING_VENUE_TRX_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-068 Datatype: VARCHAR(52)\",\"default\":null},{\"name\":\"VALIDITY_PERIOD_IND\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"VALIDITY_PERIOD_INDS\",\"symbols\":[\"GDAY\",\"GTCA\",\"GTHT\",\"GTHD\",\"GTDT\",\"GAFT\",\"GAFD\",\"GADT\",\"IOCA\",\"FORK\",\"OTHR\"]}],\"doc\":\"ORK-069\",\"default\":null},{\"name\":\"ORDER_RESTRICTION\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ORDER_RESTRICTION_TYPES\",\"symbols\":[\"SESR\",\"VFAR\",\"VFCR\",\"OTHR\"]}],\"doc\":\"ORK-070\",\"default\":null},{\"name\":\"VALIDITY_PERIOD_END_DATE\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-071\",\"default\":null},{\"name\":\"AGG_ORDER_IND\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-072\",\"default\":null},{\"name\":\"SEND_ENTITY_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-079 Datatype: VARCHAR(20)\",\"default\":null},{\"name\":\"SEND_ENTITY_ID_TYPE\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"SEND_ENTITY_ID_TYPES\",\"symbols\":[\"COKIS\",\"BPKN\",\"ISIS\",\"INTID\",\"DPTNR\",\"LEI\"]}],\"doc\":\"ORK-080\",\"default\":null},{\"name\":\"UNDL_INSTR_ID\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"ORK-085 Datatype: VARCHAR(20000)\",\"default\":null},{\"name\":\"UNDL_INSTR_ID_TYPE\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"UNDL_INSTR_ID_TYPES\",\"symbols\":[\"ISIN\",\"WPKN\",\"CUSIP\",\"IDDS\",\"INTID\",\"SEDOL\",\"RIC\",\"RED\",\"BBG\",\"EXTS\"]}}],\"doc\":\"ORK-086 Datatype: VARCHAR(20000)\",\"default\":null},{\"name\":\"PASSV_AGGR_IND\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"PASSV_AGGR_INDS\",\"symbols\":[\"PASS\",\"AGGR\"]}],\"doc\":\"ORK-088 Datatype: VARCHAR(4)\",\"default\":null},{\"name\":\"EXEC_WITHIN_FIRM\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-096 Datatype: VARCHAR(50)\",\"default\":null},{\"name\":\"PRODUCT_DESC\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-097 Datatype: VARCHAR(280)\",\"default\":null},{\"name\":\"CONTRACT_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-098 Datatype: VARCHAR(140)\",\"default\":null},{\"name\":\"CURRENCY_PAIR\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-099 Datatype: VARCHAR(20)\",\"default\":null},{\"name\":\"INVEST_DECISION_WITHIN_FIRM\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-102 Datatype: VARCHAR(10)\",\"default\":null},{\"name\":\"COUNTRY_WHERE_ORD_RECEIVED\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-103 Datatype: VARCHAR(2)\",\"default\":null},{\"name\":\"ACT_ON_BEHALF_CLIENT_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-104 Datatype: VARCHAR(20)\",\"default\":null},{\"name\":\"ACT_ON_BEHALF_CLIENT_ID_TYPE\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ACT_ON_BEHALF_CLIENT_ID_TYPES\",\"symbols\":[\"COKIS\",\"BPKN\",\"ISIS\"]}],\"doc\":\"ORK-105\",\"default\":null},{\"name\":\"QUOTE_VALID_UNTIL\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-106\",\"default\":null},{\"name\":\"QUOTE_CXL_REASON\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"QUOTE_CXL_REASONS\",\"symbols\":[\"MKTDIST\",\"LMTEXH\",\"OUTFM\",\"OUTTECH\",\"OTHR\"]}],\"doc\":\"ORK-107\",\"default\":null},{\"name\":\"PTT_EXMPT_REASON\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"PTT_EXMPT_REASONS\",\"symbols\":[\"PORTF\",\"PCKGTRX\",\"ESCB\"]}],\"doc\":\"ORK-108\",\"default\":null},{\"name\":\"SPREAD\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-111\",\"default\":null},{\"name\":\"XCHANGE_RATE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-112\",\"default\":null},{\"name\":\"REF_PRICE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-113\",\"default\":null},{\"name\":\"PAY_NOTIONAL\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-114\",\"default\":null},{\"name\":\"RCV_NOTIONAL\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-115\",\"default\":null},{\"name\":\"PAY_NOTIONAL_CURRENCY\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-116 Datatype: VARCHAR(3)\",\"default\":null},{\"name\":\"RCV_NOTIONAL_CURRENCY\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-117 Datatype: VARCHAR(3)\",\"default\":null},{\"name\":\"REPO_RATE\",\"type\":[\"null\",{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":17}],\"doc\":\"ORK-118\",\"default\":null},{\"name\":\"STRIKE_PRICE_PEND\",\"type\":[\"null\",\"boolean\"],\"doc\":\"ORK-119\",\"default\":null},{\"name\":\"STRIKE_PRICE_NOTATION\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"STRIKE_PRICE_NOTATION_TYPES\",\"symbols\":[\"MONE\",\"YIEL\",\"PERC\"]}}],\"doc\":\"ORK-120 Each value is VARCHAR(4), max. 1000 values.\",\"default\":null},{\"name\":\"EXCH_SEQ_NR\",\"type\":[\"null\",\"int\"],\"doc\":\"ORK-121\",\"default\":null},{\"name\":\"QUOTE_ACCEPT_TIME\",\"type\":[\"null\",{\"type\":\"long\",\"logicalType\":\"timestamp-micros\"}],\"doc\":\"ORK-122\",\"default\":null},{\"name\":\"COUNTERPARTY_ID\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-123 Datatype: VARCHAR(20)\",\"default\":null},{\"name\":\"COUNTERPARTY_ID_TYPE\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"COUNTERPARTY_ID_TYPES\",\"symbols\":[\"COKIS\",\"BPKN\",\"ISIS\",\"DPTNR\",\"LEI\"]}],\"doc\":\"ORK-124 Datatype: VARCHAR(5)\",\"default\":null},{\"name\":\"EXEC_ID_INT\",\"type\":[\"null\",\"string\"],\"doc\":\"ORK-125 Datatype: VARCHAR(5)\",\"default\":null},{\"name\":\"SHORTCODE_CLIENT\",\"type\":[\"null\",\"string\"],\"doc\":\"SCD-001 Datatype: VARCHAR(20)\",\"default\":null},{\"name\":\"SHORTCODE_IDM\",\"type\":[\"null\",\"string\"],\"doc\":\"SCD-002 Datatype: VARCHAR(20)\",\"default\":null},{\"name\":\"SHORTCODE_EDM\",\"type\":[\"null\",\"string\"],\"doc\":\"SCD-003 Datatype: VARCHAR(20)\",\"default\":null}]}")
}