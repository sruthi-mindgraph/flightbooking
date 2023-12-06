object BlockExpressionExample {
  // Declare a variable using a block expression
  val result: Int = {
    var x = 5
    x=7
    val y = 3
    x + y // The value of the block is the result of this expression
  }

  def main(args: Array[String]): Unit = {
    println(s"Result: $result")
  }
}

