////// Driver class with driver's name and Drive
////// functionality
////class Drivers extends App{
////  var name = "Enter your name: "
////  name = scala.io.StdIn.readLine()
////
////  def drive(): Unit = { //method of the function
////    println(
////      s"""Welcome $name!!
////         |Planning to go for a trip??
////         |Let's get started
////         |""".stripMargin)
////  }
////
////  def profile(name: String): Unit = {  //overloading
////    this.name = name // to refer current instance of class
////  }
////
////}
////
////class Flights(var flightChoice1: String = "AirIndia", var flightChoice2: String ="AirIndiaExpress"{
////  var b: Beverages = _ // abstract class _ default initial value
////
////  def this(flightChoice1: String) {
////    this(flightChoice1)
////  }
////  def this(flightChoice2: String): Unit = {
////    this(flightChoice2)
////  }
////
////  def getInTheCar(): Unit = {
////    println(s"Hey ${Flights.name}! Enjoy driving with your $carChoice Car")
////    driver.drive()
////  }
////
////  def enjobyBeverages(): Unit = { //abstract method
////    println("Want Beverage? Enter 1 for Tea and 2 for Coffee!")
////
////    val choice: Int = scala.io.StdIn.readInt()
////    if (choice == 1) {
////      b = new Tea()
////    }
////    if (choice == 2) {
////      b = new Coffee()
////    }
////    b.getBeverage()
////  }
////}
////
////// Beverages abstract class and
////// 2 subclasses Tea and Coffee.
////abstract class Beveragess {
////  private def addHotWater(): Unit = {
////    println("Adding hot water")
////  }
////
////  private def addMilk(): Unit = {
////    println("Adding hot milk")
////  }
////
////  private def addSugar(): Unit = {
////    println("Adding Sugar")
////  }
////
////  def getMixture(): Unit = {
////    println("Your Beverage is getting ready...")
////    addHotWater()
////    addMilk()
////    addSugar()
////  }
////
////  def getBeverage(): Unit //abstract method
////
////  def addIngredients(): Unit
////}
////
////// Interface to enforce subclasses to implement
////// cleaning tea and coffee pot.
////trait Cleans {
////  def cleanPot(): Unit
////}
////
////class Teas extends Beverages with Clean {
////  override def addIngredients(): Unit = {
////    println("Tea Bag added")
////  }
////
////  override def getBeverage(): Unit = {
////    cleanPot()
////    getMixture()
////    addIngredients()
////    println("Tea's Ready! Enjoy")
////  }
////
////  override def cleanPot(): Unit = {
////    println("Cleaning tea pot...")
////  }
////}
////
////class Coffees extends Beverages with Clean {
////  override def addIngredients(): Unit = {
////    println("Coffee Bag added ")
////  }
////
////  override def getBeverage(): Unit = {
////    cleanPot()
////    getMixture()
////    addIngredients()
////    println("Coffee's Ready! Enjoy")
////  }
////
////  override def cleanPot(): Unit = {
////    println("Cleaning Coffee pot...")
////  }
////}
////
////// main function
////object Samples {
////  def main(args: Array[String]): Unit = {
////    println("Welcome for a nice Drive")
////    val peter = new Driver()
////    peter.profile("peter")
////    //println(peter)
////
////    var c: Car = null
////    println("Want to Choose Car? Press 0 for NO and 1 for YES")
////
////    val carType: Int = scala.io.StdIn.readInt()
////    if (carType == 1) {
////      println("Enter Car name")
////      val carName: String = scala.io.StdIn.readLine()
////      c = new Car(carName)
////    } else {
////      c = new Car()
////    }
////    c.getInTheCar() //methods of car
////    c.enjobyBeverages() //method for drink
////  }
////}
//////// Driver class with driver's name and Drive
//////// functionality
//////class Drivers extends App{
//////  var name: String = "Car Owner"
//////  var license: Int = 1111
//////  var mobile: Int = 1111
//////
//////  def drive(): Unit = { //method of the function
//////    println("Drive started... Have a nice drive!")
//////  }
//////
//////  def profile(name: String): Unit = {  //overloading
//////    this.name = name // to refer current instance of class
//////  }
//////
//////  def profile(name: String, license: Int): Unit = {
//////    this.name = name
//////    this.license = license
//////  }
//////
//////  def profile(name: String, license: Int, mobile: Int): Unit = {
//////    this.name = name
//////    this.license = license
//////    this.mobile = mobile
//////  }
//////
//////  def getName: String = name // method that returns name of driver
//////}
//////// Car class aggregated with driver and
//////// composed with in-built feature beverages
//////// Tea and Coffee.
//////class Cars(var carChoice: String = "BMW", var driver: Driver = new Driver()) {
//////  var b: Beverages = _ // abstract class _ default initial value
//////
//////  def this(carChoice: String) {
//////    this(carChoice, new Driver())
//////  }
//////
//////  def getInTheCar(): Unit = {
//////    println(s"Hey ${driver.getName}! Enjoy driving with your $carChoice Car")
//////    driver.drive()
//////  }
//////
//////  def enjobyBeverages(): Unit = { //abstract method
//////    println("Want Beverage? Enter 1 for Tea and 2 for Coffee!")
//////
//////    val choice: Int = scala.io.StdIn.readInt()
//////    if (choice == 1) {
//////      b = new Tea()
//////    }
//////    if (choice == 2) {
//////      b = new Coffee()
//////    }
//////    b.getBeverage()
//////  }
//////}
//////
//////// Beverages abstract class and
//////// 2 subclasses Tea and Coffee.
//////abstract class Beveragess {
//////  private def addHotWater(): Unit = {
//////    println("Adding hot water")
//////  }
//////
//////  private def addMilk(): Unit = {
//////    println("Adding hot milk")
//////  }
//////
//////  private def addSugar(): Unit = {
//////    println("Adding Sugar")
//////  }
//////
//////  def getMixture(): Unit = {
//////    println("Your Beverage is getting ready...")
//////    addHotWater()
//////    addMilk()
//////    addSugar()
//////  }
//////
//////  def getBeverage(): Unit //abstract method
//////
//////  def addIngredients(): Unit
//////}
//////
//////// Interface to enforce subclasses to implement
//////// cleaning tea and coffee pot.
//////trait Cleans {
//////  def cleanPot(): Unit
//////}
//////
//////class Teas extends Beverages with Cleans {
//////  override def addIngredients(): Unit = {
//////    println("Tea Bag added")
//////  }
//////
//////  override def getBeverage(): Unit = {
//////    cleanPot()
//////    getMixture()
//////    addIngredients()
//////    println("Tea's Ready! Enjoy")
//////  }
//////
//////  override def cleanPot(): Unit = {
//////    println("Cleaning tea pot...")
//////  }
//////}
//////
//////class Coffees extends Beveragess with Cleans {
//////  override def addIngredients(): Unit = {
//////    println("Coffee Bag added ")
//////  }
//////
//////  override def getBeverage(): Unit = {
//////    cleanPot()
//////    getMixture()
//////    addIngredients()
//////    println("Coffee's Ready! Enjoy")
//////  }
//////
//////  override def cleanPot(): Unit = {
//////    println("Cleaning Coffee pot...")
//////  }
//////}
//////
//////// main function
//////object Samples {
//////  def main(args: Array[String]): Unit = {
//////    println("Welcome for a nice Drive")
//////    val peter = new Driver()
//////    peter.profile("peter")
//////    //println(peter)
//////
//////    var c: Car = null
//////    println("Want to Choose Car? Press 0 for NO and 1 for YES")
//////
//////    val carType: Int = scala.io.StdIn.readInt()
//////    if (carType == 1) {
//////      println("Enter Car name")
//////      val carName: String = scala.io.StdIn.readLine()
//////      c = new Car(carName)
//////    } else {
//////      c = new Car()
//////    }
//////    c.getInTheCar() //methods of car
//////    c.enjobyBeverages() //method for drink
//////  }
//////}
////////val choice: Int = scala.io.StdIn.readInt()
////////if (choice == 0) {
////////  b = new Tea()
////////}
////////if (choice == 1) {
////////  b = new Coffee()
////////}
////////b.getBeverage()
//////}
//// Driver class with driver's name and Drive
//// functionality
//class Driver extends App{
//  var name: String = "Car Owner"
//  var license: Int = 1111
//  var mobile: Int = 1111
//
//  def drive(): Unit = { //method of the function
//    println("Drive started... Have a nice drive!")
//  }
//
//  def profile(name: String): Unit = {  //overloading
//    this.name = name // to refer current instance of class
//  }
//
//  def profile(name: String, license: Int): Unit = {
//    this.name = name
//    this.license = license
//  }
//
//  def profile(name: String, license: Int, mobile: Int): Unit = {
//    this.name = name
//    this.license = license
//    this.mobile = mobile
//  }
//
//  def getName: String = name // method that returns name of driver
//}
//// Car class aggregated with driver and
//// composed with in-built feature beverages
//// Tea and Coffee.
//class Car(var carChoice: String = "BMW", var driver: Driver = new Driver()) {
//  var b: Beverages = _ // abstract class _ default initial value
//
//  def this(carChoice: String) {
//    this(carChoice, new Driver())
//  }
//
//  def getInTheCar(): Unit = {
//    println(s"Hey ${driver.getName}! Enjoy driving with your $carChoice Car")
//    driver.drive()
//  }
//
//  def enjobyBeverages(): Unit = { //abstract method
//    println("Want Beverage? Enter 1 for Tea and 2 for Coffee!")
//
//    val choice: Int = scala.io.StdIn.readInt()
//    if (choice == 1) {
//      b = new Tea()
//    }
//    if (choice == 2) {
//      b = new Coffee()
//    }
//    b.getBeverage()
//  }
//}
//
//// Beverages abstract class and
//// 2 subclasses Tea and Coffee.
//abstract class Beverages {
//  private def addHotWater(): Unit = {
//    println("Adding hot water")
//  }
//
//  private def addMilk(): Unit = {
//    println("Adding hot milk")
//  }
//
//  private def addSugar(): Unit = {
//    println("Adding Sugar")
//  }
//
//  def getMixture(): Unit = {
//    println("Your Beverage is getting ready...")
//    addHotWater()
//    addMilk()
//    addSugar()
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
//class Tea extends Beverages with Clean {
//  override def addIngredients(): Unit = {
//    println("Tea Bag added")
//  }
//
//  override def getBeverage(): Unit = {
//    cleanPot()
//    getMixture()
//    addIngredients()
//    println("Tea's Ready! Enjoy")
//  }
//
//  override def cleanPot(): Unit = {
//    println("Cleaning tea pot...")
//  }
//}
//
//class Coffee extends Beverages with Clean {
//  override def addIngredients(): Unit = {
//    println("Coffee Bag added ")
//  }
//
//  override def getBeverage(): Unit = {
//    cleanPot()
//    getMixture()
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
//    println("Welcome for a nice Drive")
//    val peter = new Driver()
//    peter.profile("peter")
//    //println(peter)
//
//    var c: Car = null
//    println("Want to Choose Car? Press 0 for NO and 1 for YES")
//
//    val carType: Int = scala.io.StdIn.readInt()
//    if (carType == 1) {
//      println("Enter Car name")
//      val carName: String = scala.io.StdIn.readLine()
//      c = new Car(carName)
//    } else {
//      c = new Car()
//    }
//    c.getInTheCar() //methods of car
//    c.enjobyBeverages() //method for drink
//  }
//}
