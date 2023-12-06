abstract class abstraction {
  def add
  def multi(): Unit = {
    println("multi")
  }
  def sub
}
class child extends abstraction{
  def add(): Unit = {
    println("add")
  }
  def sub(): Unit = {
    println("sub")
  }

}
object test{
  def main(args: Array[String]): Unit = {
    val obj=new child
    obj.add
    obj.sub
    obj.multi
  }
}