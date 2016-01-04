import scala.collection.SortedMap

/**
 * Created by mhofsche on 21.10.15.
 */
class School {

  var db:SortedMap[Int, Seq[String]] = SortedMap()

  def sorted = db.keys.map(k => k -> db(k).sorted).toMap

  def grade(i: Int) = db.getOrElse(i,Seq())

  def add(name: String, grade: Int) = {
    db.get(grade) match {
      case Some(names) => db = db + (grade -> (names :+ name))
      case _  => db = db + (grade -> Seq(name))
    }
  }




}
