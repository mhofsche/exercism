/**
  * Created by mhofsche on 02.12.15.
  */
case class PrimeFactors() {

  def primeFactors(number: Long) = {
    @annotation.tailrec
    def go(num: Long, prime: Long, acc:List[Long]):List[Long] = num match {
      case n if (n <= 1) => acc
      case n if (n%prime == 0) => go(n/prime, prime, prime :: acc)
      case n if (n%prime != 0) => go(n, prime+1, acc)
    }
    go(number,2, List()).reverse
  }
}