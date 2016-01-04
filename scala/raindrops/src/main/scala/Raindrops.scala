/**
  * Created by mhofsche on 02.12.15.
  */
case class Raindrops() {

  private val calc = PrimeFactors()
  private val regex = "[3|5|7]".r

  def replace[T](x: T, y: T) = (i: T) => if (i == x) y else i

  def convert(i: Int):String = {
    val primes = calc.primeFactors(i).filter(x=>regex.pattern.matcher(x.toString).matches()).distinct

    if (primes.isEmpty)
      i.toString
    else
      primes.map(replace(3, "Pling")).map(replace(5, "Plang")).map(replace(7, "Plong")).mkString
  }
}
