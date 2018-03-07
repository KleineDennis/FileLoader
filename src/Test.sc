import java.math.{BigDecimal,BigInteger}
import java.nio.ByteBuffer



object BigDecimal {
  /** Create a j.m.BigDecimal from the Avro ByteBuffer representation. */
  def apply(b: ByteBuffer, scale: Int): BigDecimal = {
    if (b == null) null
    else {
      val len = b.remaining
      if (len <= 0) null
      else {
        val buffer = Array.ofDim[Byte](len)
        b.get(buffer)
        new BigDecimal(new BigInteger(buffer), scale)
      }
    }
  }

    /** NPE-safe converter from BigDecimal to byte array. */
    def apply(d: BigDecimal, scale: Int): ByteBuffer = {
      if (d == null) null
      else
        ByteBuffer.wrap(d.setScale(scale).unscaledValue.toByteArray)
    }
}

val res = BigDecimal(new BigDecimal("99.63299999999999557"), 17)
res.array
val res2 = scala.math.BigDecimal("99.63299999999999557").setScale(17).underlying.unscaledValue.toByteArray