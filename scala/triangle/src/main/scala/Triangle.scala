/**
  * Created by mhofsche on 30.11.15.
  */
case class Triangle(a: Int, b: Int, c: Int) {

  def triangleType = {
    if (tooShort || illogical) TriangleType.Illogical
    else if (isEquilateral) TriangleType.Equilateral
    else if (isIsosceles) TriangleType.Isosceles
    else TriangleType.Scalene
  }

  val isEquilateral = a == b && b == c

  val isIsosceles = a == b || b == c || c == a

  val tooShort = a <= 0 || b <= 0 || c <= 0

  val illogical = a >= b + c || b >= a + c || c >= a + b
}

object TriangleType extends Enumeration {
  val Equilateral, Isosceles /*gleichschenklig*/, Scalene /*ungleichseitig*/, Illogical = Value
}
