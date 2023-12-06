object VariableDeclaration {
  def main(args: Array[String]): Unit={
    var number=100
    number=50
    var num=50
    num=20
    println("The number is: "+num)
    //block expression
    val result = {
      val x = 10
      val y = 20
      x + y // This is the last expression in the block
    }

    println(result)

  }

}
