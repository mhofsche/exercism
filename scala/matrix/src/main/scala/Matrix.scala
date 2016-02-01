/**
  * Created by mhofsche on 15.01.16.
  */
case class Matrix(s: String) {

  val arr = s.split('\n').map(_.split(' ').map(_.toInt).toVector)

  def cols(i: Int) = arr.map(_(i))

  def rows(i: Int) = arr(i)
}
