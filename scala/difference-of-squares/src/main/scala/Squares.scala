/**
  * Created by mhofsche on 27.11.15.
  */
case class Squares() {

  def difference(i: Int) = squareOfSums(i) - sumOfSquares(i)

  def sumOfSquares(i: Int) = List.range(1,i+1).map(sqr).sum

  def squareOfSums(i: Int) = sqr(List.range(1,i+1).sum)

  def sqr(i: Int) = i * i
}
