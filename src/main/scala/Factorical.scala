object Factorial {
  def factorialfuction(a:Int): BigInt={
    if(a==0 || a==1) {
      1
    }else{
      a*factorialfuction(a-1)
    }
  }
  def main(args: Array[String]): Unit={
    val x: Int=10

    println(factorialfuction(x))
  }

}
