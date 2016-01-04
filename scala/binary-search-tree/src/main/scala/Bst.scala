import scala.math.Ordering.Implicits._
/**
  * Created by mhofsche on 20.12.15.
  */
case class Bst[A:Ordering](value: A, left: Option[Bst[A]] = None, right: Option[Bst[A]] = None) {

  def insert(v: A): Bst[A] = {
    if (v <= value) this.copy(left = create(v,left)) else this.copy(right = create(v,right))
  }

  def create(v:A, b:Option[Bst[A]]) = {
    Some(if(b.isEmpty) Bst(v) else b.get.insert(v))
  }
}

object Bst {
  def fromList[A:Ordering](list: List[A]): Bst[A] =
    list.tail.foldLeft(Bst(list.head)) { (b,v) => b.insert(v) }

  def toList[A:Ordering](bst: Bst[A]): List[A] = {
    def go(b: Option[Bst[A]]): List[A] = b match {
      case None => Nil
      case _ => b.get.value :: go(b.get.right) ::: go(b.get.left) sorted
    }
    go(Option(bst))
  }
}
