object CallByValueExample {
  def main(args: Array[String]): Unit = {
    // Declare a variable with a simple expression
    val x = 10

    // Call a function with a parameter by value
    println("Result of callByValueFunction: " + callByValueFunction(x))
  }

  // Function that takes a parameter by value
  def callByValueFunction(a: Int): Int = {
    // Some computation
    println("Inside callByValueFunction")

    // Return the result
    a * 2+5+a
  }
}
