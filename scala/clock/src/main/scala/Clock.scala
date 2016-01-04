import java.text.SimpleDateFormat
import java.util.Calendar._
/**
  * Created by mhofsche on 27.12.15.
  */
case class Clock(hour: Int, minute: Int) {

  def -(c:Clock) = Clock(getHour - c.getHour, getMin - c.getMin)

  def +(c:Clock) = Clock(getHour + c.getHour, getMin + c.getMin)

  override def toString = new SimpleDateFormat("HH:mm").format(calendar.getTime)

  override def equals(obj: scala.Any) = obj.toString == this.toString

  private val calendar = {
    val c = getInstance
    c.set(HOUR_OF_DAY, hour)
    c.set(MINUTE, minute)
    c
  }

  private val getHour = this.calendar.get(HOUR_OF_DAY)
  private val getMin = this.calendar.get(MINUTE)
}

object Clock {
  def apply(minute: Int) = new Clock(0,minute)
}
