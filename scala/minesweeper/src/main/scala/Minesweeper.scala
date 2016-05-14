/**
  * Created by mhofsche on 14.05.16.
  */
object Minesweeper {

  def annotate(list: List[String]) : List[String] = {

    if (list.isEmpty) return list

    var matrix = list.map(_.toList)

    matrix.indices.map(i => matrix(i).indices.map(j => numNeighboringMines(i,j,matrix)).mkString).toList

  }

  def numNeighboringMines(x:Int,y:Int,list:List[List[Char]]) : String = {

    if (isBomb(x,y,list)) return "*"

    var ys = list.length
    var xs = list.head.length

    var counter = 0

    if (isBomb(x-1,y-1,list)) counter = counter+1
    if (isBomb(x-1,y,list)) counter = counter+1
    if (isBomb(x-1,y+1,list)) counter = counter+1
    if (isBomb(x,y-1,list)) counter = counter+1

    if (isBomb(x,y+1,list)) counter = counter+1
    if (isBomb(x+1,y-1,list)) counter = counter+1
    if (isBomb(x+1,y,list)) counter = counter+1
    if (isBomb(x+1,y+1,list)) counter = counter+1

    if (counter == 0 ) return " "
    counter.toString
  }

  def isBomb(x:Int,y:Int,list:List[List[Char]]):Boolean = {
    var xs = list.length
    var ys = list.head.length
    (x >= 0 && x < xs && y >= 0 && y < ys) && list(x)(y)=='*'
  }
}
