object Loops {
  def main(args: Array[String]): Unit = {
    //    for(i <- 1 to 3)//<-generator,i variable,1 to 10 range
    //      println("i : "+i)
    //    for (i <- 1 until 10)
    //      println("i using until: " + i)
    //    for (i <- 1 to 10;j <- 1 to 3)
    //      println("i,j using multiple parameters: " + i, " ",+j)
    //    for (i <- 1 to 10;j <- 1 to 3) //doubt!
    //      println(i)
    //    val lst=List(1,2,3,4,5,6,7,8,9,10)
    //    for(i <- lst)
    //      println("for in list: "+i)
    //    for (i <- lst; if i<5)
    //      println("for and if in list: " + i)
    //    val result=for{i <- lst;if i<5}yield {
    //      i*i
    //    }
    //    println("for yield: "+result)
    //    lst.foreach { num =>
    //      println("for each: "+num)
    //    }
    //    var x=0
    //     while(x<7) {
    //       println("x in while: "+x)
    //       x+=1
    //     }
    //    var y=1
    //    do{
    //      y+=1
    //      println("y in do while: "+y)
    //    }
    //    while(y<9)
    //    var i = 0
    //    do {
    //      // Code to be repeated
    //      i += 1
    //    } while (i < 5)
    //  }
    //
    //    var y = 1
    //    do {
    //      y += 1
    //      println("y in do while: " + y)
    //    }
    //    while (y < 3)
    //    var i = 0
    //  }
//
    val numbers = List(1, 2, 3)

    // Using for-yield to transform elements of a List
    val squaredNumbers = for (num <- numbers) yield {
      num * num
    }

    // Print the result
    println(s"Squared numbers: $squaredNumbers")


  }
}
