import Allergen.Allergen

/**
  * Created by mhofsche on 03.12.15.
  */
case class Allergies() {

  def allergies(i: Int) = {
    @annotation.tailrec
    def go(marker:Int, allergies:List[(Option[Allergen],Int)], acc:List[Allergen]):List[Allergen] =
      allergies match {
        case (a,j) :: t if marker >= j  => go(marker - j, t, if (a.nonEmpty) a.get :: acc else acc)
        case (a,j) :: t if marker < j => go(marker, t, acc)
        case Nil => acc
      }
      //println(Allergen.allergies)
      go(i,Allergen.allergies, List())
  }

  def isAllergicTo(allergy:Allergen, i: Int) = allergies(i).contains(allergy)
}

object Allergen extends Enumeration {
  type Allergen = Value
  val Eggs,Peanuts,Shellfish,Strawberries,Tomatoes,Chocolate,Pollen,Cats = Value

  val vals = values.toList.map(Option(_)) ++ Stream.continually(None).take(12 - values.size)

  val allergies = (vals zip numList.reverse).reverse

  @annotation.tailrec
  def go(i:Int,acc:List[Int]):List[Int] = {
    if (i >= 2048) acc else go(i<<1,(i<<1) :: acc)
  }
  lazy val numList = go(1,List(1))
}