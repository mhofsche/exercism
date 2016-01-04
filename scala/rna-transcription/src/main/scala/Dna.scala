/**
  * Created by mhofsche on 30.11.15.
  */
case class Dna() {

  def toRna(s: String) = s map replace

  private def replace(c: Char) = c match {
    case 'G' => 'C'
    case 'C' => 'G'
    case 'T' => 'A'
    case 'A' => 'U'
    case _ => throw new IllegalArgumentException
  }
}
