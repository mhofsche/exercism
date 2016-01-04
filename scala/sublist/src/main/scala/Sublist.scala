/**
  * Created by mhofsche on 29.11.15.
  */
class Sublist() {

  def sublist[A,B](a: List[A], b: List[B]) = {
    if (a equals b) Sublist.Equal
    else if (b containsSlice a) Sublist.Sublist
    else if (a containsSlice b) Sublist.Superlist
    else Sublist.Unequal
  }
}

object Sublist extends Enumeration {
  val Superlist, Equal, Unequal, Sublist = Value
}
