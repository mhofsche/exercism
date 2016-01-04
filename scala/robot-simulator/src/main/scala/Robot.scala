/**
  * Created by mhofsche on 15.12.15.
  */
case class Robot(bearing: Bearing.Bearing, coordinates: (Int, Int)) {

  val xy = coordinates

  def simulate(s: String): Robot = s.foldLeft(this) {
    (r,c) => c match {
      case 'A' => r.advance()
      case 'L' => r.turnLeft()
      case 'R' => r.turnRight()
    }
  }

  def turnLeft():Robot = {
    val id = bearing.id-1
    Robot(Bearing.apply(if (id<0) 3 else id),xy)
  }

  def turnRight():Robot = {
    val id = bearing.id+1
    Robot(Bearing.apply(if (id>3) 0 else id),xy)
  }

  def advance():Robot = bearing match {
    case Bearing.North => get(xy._1,xy._2+1)
    case Bearing.East => get(xy._1+1,xy._2)
    case Bearing.South => get(xy._1,xy._2-1)
    case Bearing.West => get(xy._1-1,xy._2)
  }

  def get(coordinates: (Int, Int)) = Robot(bearing, coordinates)
}

object Bearing extends Enumeration {
  type Bearing = Value
  val North = Value(0)
  val East = Value(1)
  val South = Value(2)
  val West = Value(3)
}
