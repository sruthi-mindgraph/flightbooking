object Explicit {
  // Function with explicit return type
  def multiply(x: Int, y: Int): Unit = {
    val result = x * y

  }

  def main(args: Array[String]): Unit = {
    // Corrected: Call the multiply function and print the result
    val result = multiply(3, 4)
    println("Result: " + result)
  }
}
