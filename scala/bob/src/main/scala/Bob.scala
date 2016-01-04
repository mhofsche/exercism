/**
 * Created by mhofsche on 20.09.15.
 */
class Bob {

  def hey(say : String): String = say match {

    case `say` if empty(say) => "Fine. Be that way!"

    case `say` if question(say) => "Sure."

    case `say` if upper(say) => "Whoa, chill out!"

    case _ => "Whatever."

  }

  def empty(s:String) = s != null && s.trim.isEmpty

  def upper(s:String) = s.toUpperCase == s && s.filter(_.isLetter).length > 0

  def question(s:String) = s.endsWith("?") && ! upper(s)

}
