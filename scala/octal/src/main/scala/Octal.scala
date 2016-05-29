/**
  * Created by mh186033 on 23/05/16.
  */
object Octal {

  private val BASE = 8

  def octalToInt(s:String):Int = {
    require(!s.isEmpty)
    require(s.forall(_.asDigit < BASE))
    octalToDecimal(s)
  }

  def intToOctal(i: Int): String = {
    decimalToOctal(i)
  }

  private def octalToDecimal(s:String):Int = {
    @annotation.tailrec
    def go(l:List[Int], r:Int):Int = l match {
      case h :: Nil => r + h
      case h :: t => go(t, (r + h) * BASE)
    }
    go(s.map(_.asDigit).toList, 0)
  }

  private def decimalToOctal(i:Int):String = {
    @annotation.tailrec
    def go(q:Int, acc: String): String = q match {
      case n if n == 0 => acc
      case n => go(n / BASE, n % BASE + acc)
    }
    if (i == 0) "0" else go(i, "")
  }
}
