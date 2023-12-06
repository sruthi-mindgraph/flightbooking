object practice{
  def main(args: Array[String]): Unit={
    for (i <- 1 until 10) {
      println("i : " + i)
    }
    for (i <- 1 to 11){
      println("i : "+ i)
    }

    val lst = List(1, 2, 3, 4, 5)
    for (i <- lst; if i < 3)
    {
      println("forif: " + i)
    }
    for(i <- 1 to 5; j <- 1 to 3){
      println("mutiple i : "+ i+" "+j)
    }
  }

}
