/**
  * Created by mhofsche on 24.12.15.
  */
object Hexadecimal {
  private val digits = "0123456789ABCDEF"
  def hexToInt(s: String) = {
    val upper = s.toUpperCase.filter(digits contains _)
    if (s.length == upper.length) {
      upper.foldLeft(0) { (acc, c) => 16 * acc + digits.indexOf(c) }
    } else 0
  }
}

