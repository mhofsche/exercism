/**
  * Created by mhofsche on 01.12.15.
  */
case class RomanNumeral(i: Int) {

  def value:String = i match {
    case x if x<0 || x>3999 => ""
    case _ => convert(i, vals, "")
  }

  @annotation.tailrec
  private def convert(i:Int, vals:List[(String,Int)], acc:String):String = vals match {
    case Nil => acc
    case (r,n) :: t => convert(i%n, t, acc + (r * (i/n)))
  }

  private val vals = List("M"->1000,"CM"->900,"D"->500,"CD"->400,"C"->100,"XC"->90,"L"->50,
                          "XL"->40,"X"->10,"IX"->9,"V"->5,"IV"->4,"I"->1)
}
