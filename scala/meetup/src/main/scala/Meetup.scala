import java.util.{Calendar, GregorianCalendar}

object Meetup extends Enumeration {
  case class Day(dayInWeek: Int)
  val Mon = new Day(Calendar.MONDAY)
  val Tue = new Day(Calendar.TUESDAY)
  val Wed = new Day(Calendar.WEDNESDAY)
  val Thu = new Day(Calendar.THURSDAY)
  val Fri = new Day(Calendar.FRIDAY)
  val Sat = new Day(Calendar.SATURDAY)
  val Sun = new Day(Calendar.SUNDAY)
}

case class Meetup(month:Int, year:Int) {

  def first(day: Meetup.Day):GregorianCalendar  = calc(day,1)
  def second(day: Meetup.Day):GregorianCalendar = calc(day,8)
  def third(day: Meetup.Day):GregorianCalendar  = calc(day,15)
  def fourth(day: Meetup.Day):GregorianCalendar = calc(day,22)
  def teenth(day: Meetup.Day):GregorianCalendar = calc(day,13)
  def last(day: Meetup.Day):GregorianCalendar   = calc(day,lastWeekOffset())

  def calc(day: Meetup.Day, offset:Int):GregorianCalendar = {
    new GregorianCalendar(year, month-1, getDay(day,offset))
  }

  def getDay(day:Meetup.Day, offset:Int):Int = {
    val diff = day.dayInWeek - new GregorianCalendar(year, month-1, offset).get(Calendar.DAY_OF_WEEK)
    if (diff < 0) offset + diff + 7 else offset + diff
  }

  def lastWeekOffset():Int = {
    new GregorianCalendar(year, month-1, 1).getActualMaximum(Calendar.DAY_OF_MONTH) - 6
  }
}

