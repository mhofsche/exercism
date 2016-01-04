/**
 * Created by mhofsche on 01.11.15.
 */
object ETL {
  def transform(old: Map[Int, Seq[String]]):Map[String,Int] = {
    old.flatMap {
      case(k,v) => v.map(_.toLowerCase -> k)
    }
  }
}
