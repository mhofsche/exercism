import scala.collection.mutable.ListBuffer
/**
  * Created by mhofsche on 06.12.15.
  */
case class BankAccount() {

  var account = new ListBuffer[Int]()
  var closed = false

  def closeAccount() = {
    closed = true
    account = new ListBuffer[Int]()
  }

  def incrementBalance(i: Int) = {
    if (!closed) this.synchronized { account += i }
    getBalance
  }

  def getBalance:Option[Int] = {
    if (closed) None else Option(account.sum)
  }

}
