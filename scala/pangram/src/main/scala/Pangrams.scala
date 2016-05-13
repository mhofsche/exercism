/**
  * Created by mh186033 on 12/05/16.
  */
object Pangrams {

  def isPangram(s: String) = {
    s.toLowerCase.filter(c => c >= 'a' && c <= 'z').distinct.length == ('a' to 'z').length
  }
}
