/**
 * Created by mhofsche on 21.10.15.
 */
class PhoneNumber(phoneNumber: String) {

  val cNum = phoneNumber filter (_.isDigit)

  def number = cNum match {
    case c if c.length == 10 => cNum
    case c if c.length > 10 && c.startsWith("1") => c.slice(1,20)
    case _ => "0" * 10
  }

  def areaCode = slice(0,3)

  def slice(a:Int,b:Int) = {
    //number.substring(a,b)
    number.slice(a,b)
  }

  override def toString = {
    val mc = slice(3,6)
    val bc = slice(6,10)
    s"($areaCode) $mc-$bc"
  }
}
