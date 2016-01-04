/**
  * Created by mhofsche on 06.12.15.
  */
case class CryptoSquare() {

  def ciphertext(s:String) = normalize(normalizedCiphertext(s))

  def plaintextSegments(s: String) = normalize(s).grouped(squareSize(s)).toList

  def squareSize(s: String):Int =  math.ceil(math.sqrt(normalize(s).length)).toInt

  def normalizePlaintext(s: String) = normalize(s)

  def normalizedCiphertext(s: String) = {
    if (squareSize(s) < 1) "" else (1 to squareSize(s)).map(lift(_,s)).mkString(" ")
  }

  def lift(i:Int,s:String) = plaintextSegments(s).flatMap(_.lift(i-1)).mkString

  def normalize(s:String) = s.toLowerCase.filter(_.isLetterOrDigit)
}

// abcde abcde abcde abcde => aaaa bbbb cccc dddd eeee

/*
def ciphertext(s: String) = {
  val sqrLength = squareSize(s)
  if (sqrLength > 0) {
    plaintextSegments(s)
      .map(a => a.toList.padTo(sqrLength, "*")).transpose
      .flatten.mkString.filter(_.isLetterOrDigit)
  } else ""
}
*/