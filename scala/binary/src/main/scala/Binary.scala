/**
  * Created by mhofsche on 30.11.15.
  */
case class Binary(s: String) {
  def toDecimal = {
    if (s.filter(_.isDigit).length == s.length)
      s.reverse.map(_.asDigit).zipWithIndex.map{case(c,i)=>calc(c,i)}.sum
    else
      0
  }

  def calc(c:Int,i:Int) = {
    (c * Math.pow(2,i)).toInt
  }
}
