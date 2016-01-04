import java.util.{Calendar, GregorianCalendar}

/**
  * Created by mhofsche on 23.11.15.
  */
case class Gigasecond(cal: GregorianCalendar) {
  def date = {
    val ret = new GregorianCalendar(cal.getTimeZone)
    ret.setTimeInMillis(cal.getTimeInMillis + 1000000000000L)
    ret
  }
}
