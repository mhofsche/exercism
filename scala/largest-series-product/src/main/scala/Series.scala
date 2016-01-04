/**
  * Created by mhofsche on 25.12.15.
  */
object Series {
  def largestProduct(i: Int, s: String) = {
    val li = slices(i,s).map(_.product)
    if (li.nonEmpty) li.max else 1
  }

  def slices(i: Int, s: String) = {
    digits(s).iterator.sliding(i).withPartial(false).toList
  }

  def digits(s: String):List[Int] = s.map(_.asDigit).toList

}
