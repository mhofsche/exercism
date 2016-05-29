/**
  * Created by mh186033 on 29/05/16.
  */
object Trinary {

  private val TRI = 3

  def intToTrinary(i: Int): String = {
    require(i > -1)
    decToTrinary(i)
  }

  def decToTrinary(in:Int):String = {
    @annotation.tailrec
    def go(v:Int,acc:String):String = v match {
      case n if n < 1 => acc
      case n => go((n-(n%TRI))/TRI, n%TRI + acc)
    }
    if (in == 0) "0" else go(in,"")
  }

  def trinaryToInt(s: String): Int = {
    require(!s.isEmpty)
    require(s.forall(_.asDigit < 3))
    trinaryToDec(s)
  }

  private def trinaryToDec(s:String):Int = {
    val l = s.map(_.asDigit).toList
    @annotation.tailrec
    def go(l:List[Int], r:Int):Int = l match {
      case h :: Nil => r + h
      case h :: t => go(t, (r + h) * TRI)
    }
    go(l, 0)
  }
}
