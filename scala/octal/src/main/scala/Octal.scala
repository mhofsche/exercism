/**
  * Created by mh186033 on 23/05/16.
  */
object Octal {

  private val BASE = 8

  def octalToInt(s:String):Int = {
    validateOctal(s)
    octalToDecimal(s)
  }

  private def validateOctal(s:String) = {
    if (s.isEmpty) err
    s.foreach(c => if (c < 48 || c > 55) err)

    def err = throw new IllegalArgumentException
  }

  def intToOctal(i: Int): String = {
    decimalToOctal(i)
  }

  private def octalToDecimal(s:String):Int = {
    val l = s.map(_.asDigit).toList
    @annotation.tailrec
    def go(l:List[Int], r:Int):Int = l match {
      case h :: Nil => r + h
      case h :: t => go(t, (r + h) * BASE)
    }
    go(l, 0)
  }

  private def decimalToOctal(i:Int):String = {
    if (i == 0) return "0"
    @annotation.tailrec
    def go(q:Int, acc:List[Int]):List[Int] = q match {
      case n if n == 0 => acc
      case n => go(n / BASE, n % BASE :: acc)
    }
    go(i, List()).mkString
  }


  //not needed but
  def intToBinary(in:Int):String = {
    @annotation.tailrec
    def go(v:Int,acc:List[String]):List[String] = v match {
      case n if n < 1 => acc
      case n if n % 2 == 0 => go(n/2, "0" :: acc)
      case n if n % 2 != 0 => go((n-1)/2,"1" :: acc);
    }
    go(in,List()).mkString
  }

  def binaryToOctal(b:String):String = {
    padOctal(b).grouped(3).map(_.toList).toList.map(l => l.head.asDigit*4 + l(1).asDigit*2 + l(2).asDigit*1).mkString
  }

  def padOctal(s:String): String = {
    val r = 3 - (s.length % 3)
    "0"*r + s
  }
}
