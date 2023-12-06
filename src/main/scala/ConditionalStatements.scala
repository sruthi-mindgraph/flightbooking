object ConditionalStatements {
  def main(arg: Array[String]): Unit={
    println("Enter the number: ")
    var number = scala.io.StdIn.readInt()
    if (number % 2 == 0) {
      println("number is even")
    } else {
      println("number is odd")
    }
    println("Enter your percentage: ")
    val p=scala.io.StdIn.readInt()
    if(p<0 || p>100){
      println("Enter the correct percentage!!")}
    else if(p>=0 && p<20){
        println("Your grade is D")}
    else if(p>=20 && p<50){
      println("Your grade is C")
    }
    else if(p>=50 && p<80){
      println("Your Grade is B")
    }
    else{
      println("Your Grade is A")
    }
  }
}
