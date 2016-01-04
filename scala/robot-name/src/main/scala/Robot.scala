/**
 * Created by mhofsche on 22.10.15.
 */
class Robot {

  var robotName = setName()

  def reset() = {
    robotName = setName()
  }

  def name: String = robotName

  def setName(): String = {
      val rand = new scala.util.Random
      rand.shuffle(('A' to 'Z').toList).take(2).mkString +
                 rand.shuffle((0 to 9).toList).take(3).mkString
  }

}
