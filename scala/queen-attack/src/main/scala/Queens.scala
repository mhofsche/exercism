import math._
/**
  * Created by mhofsche on 15.12.15.
  */
case class Queens() {

  def canAttack(w: Position, b: Position) =
    w.x == b.x || w.y == b.y || abs(w.x - b.x) == abs(w.y - b.y)

  def boardString(w: Option[Position], b: Option[Position]) = {
    (0 to 7).map(x => (0 to 7).map(y => cell(x, y, w, b)).mkString(" ") + '\n').mkString
  }

  def cell(x:Int, y:Int, w: Option[Position], b: Option[Position]) = {
    val c = Option(Position(x,y))
    if (c == w) "W" else if (c == b) "B" else "_"
  }
}

case class Position(x: Int, y: Int) { }
