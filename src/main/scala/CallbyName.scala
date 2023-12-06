object CallbyNameExample {
  def main(args: Array[String]): Unit = {
    // Declare a variable with a simple expression
    val x = 10

    // Call a function with a parameter by name
    println("Result of callByNameFunction: " + callByNameFunction(x))
  }

  // Function that takes a parameter by name
  def callByNameFunction(a: => Int): Int = {
    // Some computation
    println("Inside callByNameFunction")

    // Return the result
    a * 2 + 5 + a
  }
}
