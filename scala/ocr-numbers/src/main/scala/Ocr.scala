import scala.collection.immutable.HashMap

/**
  * Created by mh186033 on 16/05/16.
  */
case class Ocr(s: String) {

  private val Width = 3
  private val Height = 4
  private val Lines = s.split('\n')
  private val Cols = Lines.head.length / Width

  def convert = {
    colList.mkString(",")
  }

  private val rowList = {
    Range.inclusive(0, Lines.length-1, Height).map{c =>
      Lines.slice(c,c+Height).flatMap(_.toList).grouped(Width).toList
    }
  }

  private val colList = {
    rowList.map(r =>
      (0 until Cols).map(i => OCR.get(pickChar(i, r))).mkString
    )
  }

  private def pickChar(i: Int, list: List[Array[Char]]): String = {
    list.grouped(Cols).flatMap(_(i)).mkString
  }

  object OCR {

    def get(s:String) = {
      ocrMap.getOrElse(s,"?")
    }

    private val ocrMap = HashMap[String,String](
      " _ | ||_|   "->"0",
      "     |  |   "->"1",
      " _  _||_    "->"2",
      " _  _| _|   "->"3",
      "   |_|  |   "->"4",
      " _ |_  _|   "->"5",
      " _ |_ |_|   "->"6",
      " _   |  |   "->"7",
      " _ |_||_|   "->"8",
      " _ |_| _|   "->"9"
    )
  }
}