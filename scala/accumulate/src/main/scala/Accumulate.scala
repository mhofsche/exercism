/**
  * Created by mhofsche on 29.11.15.
  */
class Accumulate {

  def accumulate[A, B](f:(A) => B, list:List[A]):List[B] = go(f, list, Nil).reverse

  @annotation.tailrec
  private def go[A, B](f:(A) => B, list:List[A], ret: List[B]): List[B] = {
    list match {
      case Nil => ret
      case h :: t => go(f, t, f(h) :: ret)
    }
  }
}