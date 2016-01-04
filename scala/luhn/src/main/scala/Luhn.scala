/**
  * Created by mhofsche on 25.12.15.
  */
case class Luhn(id: Long) {

  def create = (asList :+ createChecksum(id)).mkString.toLong

  def isValid = checksum==0

  def checksum = addends.sum % 10

  def checkDigit = id % 10

  def addends = {
    val list = asList.reverse
    list.indices.map(i =>
      {
        val single = list(i)
        val double = list(i)*2

        if(i%2 != 0)
          if (double > 10) double - 9 else double
        else
          single
      }
    ).reverse
  }

  private def createChecksum(id:Long) = (Luhn(id*10).checksum * 9) % 10

  private def asList = id.toString.map(_.asDigit).toList

}
