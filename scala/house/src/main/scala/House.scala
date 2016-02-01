/**
  * Created by mhofsche on 28.01.16.
  */
object House {

  def rhyme = {
    @annotation.tailrec
    def go(num:Int, acc:List[String]):List[String] = {
      val sub = items.slice(0,num).reverse
      if (num > items.size) acc
      else go(num+1, acc  ::: getRhyme(sub) )
    }
    go(1, List()).mkString("\n") + "\n"
  }

  private def getRhyme(list:List[(String,String)]):List[String] = {
    val head = "This is the " + list.head._2
    val tail = list.tail.map(s => "that " + s._1 + " the " + s._2)
    head :: tail ::: List("")
  }

  private val items =
    List(
      ("lay in", "house that Jack built."), ("ate", "malt"), ("killed", "rat"), ("worried", "cat"),
      ("tossed", "dog"), ("milked", "cow with the crumpled horn"), ("kissed", "maiden all forlorn"),
      ("married", "man all tattered and torn"), ("woke", "priest all shaven and shorn"),
      ("kept", "rooster that crowed in the morn"), ("belonged to", "farmer sowing his corn"),
      ("", "horse and the hound and the horn")
    )
}