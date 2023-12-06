object Demo extends App{
  val myarray:Array[Int]= new Array[Int](3)
  val myarray2= new Array(2)
  myarray(0)=1
  myarray(1)=2
  myarray(2)=3
  println(myarray)
  for (x <- myarray){
    println(x)
  }
  for(i<-0 until myarray.length-1){

  }
  println(myarray.length)

}
