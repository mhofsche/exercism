/**
  * Created by mhofsche on 05.12.15.
  */
case class Atbash() {

  def encode(s: String) = s.filter(_.isLetterOrDigit).map(replace).grouped(5).toList mkString " "

  def replace(c:Char):Char = at.getOrElse(c.toLower, c)

  val plain = 'a' to 'z'
  val at = plain zip plain.reverse toMap
}