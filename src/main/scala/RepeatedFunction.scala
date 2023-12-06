object RepeatedFunction {
  def repeat(a: String, b: Int): String={
    if(b==1) {
      a
    } else{
      a+repeat(a,b-1)
    }
  }
  def main(args: Array[String]): Unit={
    println(repeat("hello",5))
  }

}
