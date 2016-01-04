/**
  * Created by mhofsche on 12.12.15.
  */
case class Garden(kids: List[String], pots: String) {

  val potsArr = pots.split('\n')
  val names = kids.sorted

  def getPlants(name:String) = {
    val idx = names.indexOf(name) * 2
    if (idx>=0) {
      getForName(potsArr(0),idx) ::: getForName(potsArr(1),idx)
    } else {
      List.empty
    }
  }
  def getForName(pots:String, idx:Int) = Plant.convert(pots.filter(_.isLetter).toList).slice(idx,idx+2)
}

object Garden {
  def defaultGarden(pots: String): Garden = Garden(names, pots)
  var names = List("Alice","Bob","Charlie","David","Eve","Fred","Ginny","Harriet","Ileana","Joseph","Kincaid","Larry")
}

object Plant extends Enumeration {
  type Plant = Value
  val Violets = Value("V")
  val Radishes = Value("R")
  val Grass = Value("G")
  val Clover = Value("C")

  def convert(s:List[Char]):List[Plant.Plant] = s.map(_.toString).map(Plant.withName)
}