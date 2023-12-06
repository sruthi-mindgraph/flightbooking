object CbvvsCbn {
  def main(args: Array[String]): Unit = {
    var x=System.nanoTime()
    callbyvalue(x)
    callbyname(x)
  }
  def callbyvalue(x: Long): Unit = {
    println("call by value: "+x)
    println("call by value: "+x)
  }
  def callbyname(x: => Long): Unit={
    println("call by name: " + x)
    println("call by name: " + x)
  }


}
