//// Driver class with driver's name and Drive
//// functionality
//
//class Flight_Ticket() extends App{
//  var name: String = "Enter your name"
//  var purpose: String = "Age"
//  var mobile: Int = 123
//
//  def flight(): Unit = { //method of the function
//    println("Expecting a safe journey")
//  }
//
//  def profile(name: String): Unit = {  //overloading
//    this.name = name // to refer current instance of class
//  }
//
//  def profile(name: String, purpose: String): Unit = {
//    this.name = name
//    this.purpose = purpose
//  }
//
//  def profile(name: String, purpose: String, mobile: Int): Unit = {
//    this.name = name
//    this.purpose = purpose
//    this.mobile = mobile
//  }
//
//  def getName: String = name // method that returns name of driver
//}
//// Car class aggregated with driver and
//// composed with in-built feature beverages
//// Tea and Coffee.
//class Tickets(var flightChoice: String = "Basic", var driver: Flight_Ticket = new Flight_Ticket()) {
//  var b: displayinfo = _ // abstract class _ default initial value
//
//  def this(flightChoice: String) {
//    this(flightChoice, new Flight_Ticket())
//  }
//
//  def Initial(): Unit = {
//    println("Enter the number of tickets: ")
//    val number_of_tickets=scala.io.StdIn.readInt()
//    if(number_of_tickets > 20){
//      println("So many seats are not available")
//    }else{
//      println(s"confirming $number_of_tickets tickets")
//    }
//    driver.flight()
//  }
//
//  def enjobyBeverages(): Unit = { //abstract method
//    println(
//      """Do you require Food and beverages?
//        |Enter 1 if Yes
//        |Enter 0 if No
//        |""".stripMargin)
//
//    val choice: Int = scala.io.StdIn.readInt()
//    if (choice == 0) {
//      println("Okay, Thank you")
//    }
//    if (choice == 1) {
//      println(
//        """Thank you,
//          |For Food Enter 1
//          |For Beverage Enter 2
//          |For both Food and Beverage Enter 3
//          |""".stripMargin)
//      val choice: Int = scala.io.StdIn.readInt()
//      if (choice == 1){
//        println("The food during your journey will be provided")
//      }
//      if (choice == 2){
//        println("The beverages during your journey will be provided")
//      }
//      if (choice == 3){
//        println("The food and beverages during your journey will be provided")
//      }
//      println("Thank you for Choosing our service")
//    }
//    b.getBeverage()
//  }
//}
//
//// Beverages abstract class and
//// 2 subclasses Tea and Coffee.
//abstract class displayinfo {
//  private def Username(): Unit = {
//    println("Enter your name: ")
//    val name: String = scala.io.StdIn.readLine()
//    println(name)
//  }
//
//  private def totalpassengers(): Unit = {
//    println("Enter the no of total passengers: ")
//    val num: Int = scala.io.StdIn.readInt()
//    println(num)
//  }
//
//  private def dates(): Unit = {
//    println("Enter the date in dd/mm/yyyy format")
//    val date: String = scala.io.StdIn.readLine()
//    println("The date for the flight is ",date)
//  }
//
//  def traveldetails(): Unit = {
//    println("Your requisition is processed")
//    Username()
//    totalpassengers()
//    dates()
//  }
//
//  def getBeverage(): Unit //abstract method
//
//  def addIngredients(): Unit
//}
//
//// Interface to enforce subclasses to implement
//// cleaning tea and coffee pot.
//trait Clean {
//  def cleanPot(): Unit
//}
//
//class Tea extends displayinfo with Clean {
//  override def addIngredients(): Unit = {
//    println("Tea Bag added")
//  }
//
//  override def getBeverage(): Unit = {
//    cleanPot()
//    traveldetails()
//    addIngredients()
//    println("Tea's Ready! Enjoy")
//  }
//
//  override def cleanPot(): Unit = {
//    println("Cleaning tea pot...")
//  }
//}
//
//class Coffee extends displayinfo with Clean {
//  override def addIngredients(): Unit = {
//    println("Coffee Bag added ")
//  }
//
//  override def getBeverage(): Unit = {
//    cleanPot()
//    traveldetails()
//    addIngredients()
//    println("Coffee's Ready! Enjoy")
//  }
//
//  override def cleanPot(): Unit = {
//    println("Cleaning Coffee pot...")
//  }
//}
//
//// main function
//object Sample {
//  def main(args: Array[String]): Unit = {
//    println(
//      """Welcome!!
//        |Planning for a Trip??
//        |""".stripMargin)
//    val peter = new Flight_Ticket()
//    peter.profile("peter")
//    //println(peter)
//    val list: List[String] = List("Air India", "Air Asia", "Air India Express")
//    println("The Flights available for booking are: " )
//    list.foreach(println)
//
//
//      var c: Tickets = null
//      println(
//        """Enter 0 below if not booking
//          |Enter 1 below if booking
//          |Booking a Ticket? """.stripMargin)
//
////      val carType: Int = scala.io.StdIn.readInt()
////      if (carType == 1) {
////        println("Enter the flight name: ")
////        val carName: String = scala.io.StdIn.readLine()
////        c = new Tickets(carName)
////
////        if (carName == "Air India") {
////          println("It has 20 seats Available")
////        }
////        else if (carName == "Air Asia") {
////          println("It has 30 seats Available")
////        }
////        else if (carName == "Air India Express"){
////          println("It has 10 seats available")
////        }
////        else{
////          println(
////            s"""Sorry!, $carName is not available for now!!
////               |Come back later
////               |Thank You for visiting
////               |""".stripMargin)
////          System.exit(0)
////        }
////      } else {
////        c = new Tickets()
////        println("Thankyou and please visit again")
////        System.exit(0)
////      }
////      c.Initial() //methods of car
////      c.enjobyBeverages() //method for drink
////    }
////  }
//
