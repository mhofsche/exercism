/**
  * Created by mhofsche on 21.11.15.
  */
case class SpaceAge(secs: Long) {
  def seconds = secs
  def onNeptune = calc(164.79132)
  def onUranus  = calc(84.016846)
  def onSaturn  = calc(29.447498)
  def onJupiter = calc(11.862615)
  def onMars    = calc(1.8808158)
  def onVenus   = calc(0.61519726)
  def onMercury = calc(0.2408467)
  def onEarth   = calc(1.00)

  def calc(d:Double):Double = round( (secs / 31557600.00) / d)

  def round(d:Double):Double = BigDecimal(d).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
}
