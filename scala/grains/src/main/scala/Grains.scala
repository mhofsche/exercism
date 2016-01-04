/**
  * Created by mhofsche on 21.11.15.
  */
object Grains {

  def square(numSquare: Int) = BigInt(2).pow(numSquare-1)

  def total = {
    @annotation.tailrec
    def go(n: Int, acc:BigInt):BigInt = {
      if (n > 64) acc
      else go(n+1, acc + square(n))
    }
    go(1,0)
  }
}
