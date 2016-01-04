/**
 * Created by mhofsche on 27.09.15.
 */
class Phrase(s: String) {

  val list = s.toLowerCase.split(Array(' ', ',')).toList map (w => w.filter(Character.isLetterOrDigit(_))) filter (_ != "")

  def wordCount = list.foldLeft(Map[String,Int]() withDefaultValue 0) {(m,x) => m + (x -> (1 + m(x)))}

}
