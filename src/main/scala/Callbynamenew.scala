object Callbynamenew {
  def evaluate(x: => Int, y: => Int): Int={
    x*x
  }
  def main(args: Array[String]): Unit={
    println(evaluate(3+4,8))
  }

}
