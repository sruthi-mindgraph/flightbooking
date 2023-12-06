object Replace {
  val inputString = "apple banana apple orange apple"
  val pattern = "apple".r

  //val replacedString = pattern.replaceFirstIn(inputString, "fruit")
  //replacedString

  val replacedAllString = pattern.replaceAllIn(inputString, "fruit")
  println(replacedAllString)


  def main (args: Array[String]): Unit={
    println(replacedAllString)
  }

}
