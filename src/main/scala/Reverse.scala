object Reverse {
  def main(args: Array[String]): Unit = {
    var n = scala.io.StdIn.readInt()
    var num = 0
    while (n % 10 > 0) {
      var r = n % 10
      num = num * 10 + r
      n=n/10
    }
    print(num)
  }
}
