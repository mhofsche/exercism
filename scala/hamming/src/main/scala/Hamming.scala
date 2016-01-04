/**
 * Created by mhofsche on 20.09.15.
 */
object Hamming {
  def compute(s: String, s1: String): Int = {

    require (s.length == s1.length)

    (s zip s1).count(e => e._1 != e._2)

  }


}
