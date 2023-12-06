object InferredReturnType {
  def add(x: Int, y: Int) = {
    x + y // Compiler infers that the return type is Int
  }

  def main(args: Array[String]): Unit = {
    val result = add(3, 4)
    println("Result: " + result)
  }

}
