/**
 * Created by mhofsche on 20.10.15.
 */
class DNA(dna: String) {

  validateDNA(dna)

  def nucleotideCounts(): Map[Char,Int] = {
    Map('A' -> count('A'), 'C' -> count('C'), 'G' -> count('G'), 'T' -> count('T'))
  }

  def nucleotideCounts(c: Char): Int = {
    validate(c)
    count(c)
  }

  def count(c: Char) : Int = {
    dna.count(_ == c)
  }

  def validateDNA(str: String) = {
    str.foreach(c => validate(c))
  }

  def validate(c: Char) = c match {
      case 'A' | 'C' | 'G' | 'T' =>
      case _ => throw new IllegalArgumentException

  }
}
