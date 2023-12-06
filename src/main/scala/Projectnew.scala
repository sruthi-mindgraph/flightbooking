
class FlightTickets extends App{
  var name: String = "Flight Ticketssssssssss"
  var mailid: String = "abc@gmail.com"
  var mobile: String = "Chennai"

  def flight(): Unit = { //method of the function
    println("Expecting a safe journey")
  }

  def profile(name: String): Unit = {  //overloading
    this.name=name // to refer current instance of class
  }

  def profile(name: String, branch: Int): Unit = {
    this.name = name
    this.mailid = mailid
  }

  def profile(name: String, branch: Int, location: String): Unit = {
    this.name = name
    this.mailid = mailid
    this.mobile = mobile
  }

  def getName: String = name // method that returns name of showroom
}

class Tickets(var flightChoice: String = "Basic", var seat: FlightTickets = new FlightTickets()) {
  var b: displayinfo = _ // abstract class _ default initial value

  def this(flightChoice: String) {
    this(flightChoice, new FlightTickets())
  }

  def Initial(): Unit = {
    println("Enter the number of tickets: ")
    val number_of_tickets = scala.io.StdIn.readInt()
    if (number_of_tickets < 20) {
      println(s"confirming $number_of_tickets tickets")
    } else {
      println(
        """So many seats are not available
          |Check later
          |Thank you and visit again!!
          |""".stripMargin)
      System.exit(0)
    }
    seat.flight()
  }

  def datesavail(): Unit = {
    println(
      """DATES:
        |To continue to select the date
        |Enter 1
        |To exit
        |Enter 2""".stripMargin)

    val choice: Int = scala.io.StdIn.readInt()
    if (choice == 1) {
      b = new yes()
    }
    if (choice == 2) {
      b = new no()
    }
    b.dates()
  }

  def getBeverages(): Unit = { //abstract method
    println(
      """Do you require Food and beverages?
        |Enter 1 if Yes
        |Enter 0 if No
        |""".stripMargin)

    val choice: Int = scala.io.StdIn.readInt()
    if (choice == 0) {
      println("Okay, Thank you")
    }
    if (choice == 1) {
      println(
        """Thank you,
          |For Food Enter 11
          |For Beverage Enter 22
          |For both Food and Beverage Enter 33
          |""".stripMargin)
      val choice: Int = scala.io.StdIn.readInt()
      if (choice == 11) {
        println("The food during your journey will be provided")
      }
      if (choice == 22) {
        println("The beverages during your journey will be provided")
      }
      if (choice == 33) {
        println("The food and beverages during your journey will be provided")
      }
      println("Thank you for Choosing our service")
    }
    b.getBeverage()
  }


  // customerinfo abstract class and
  // 2 subclasses yes and No.
abstract class displayinfo {
    var a: String = _
    var b: String = _
    var c: String = _

    private def addname(): Unit = {
      println("Enter the name : ")
      a = scala.io.StdIn.readLine()
    }

    private def addphonenumber(): Unit = {
      println("Enter the phone number : ")
      b = scala.io.StdIn.readLine()
    }

    private def addmail(): Unit = {
      println("Enter the Email-id : ")
      c = scala.io.StdIn.readLine()
    }


    def getinformation(): Unit = {//encapsulation
      addname()
      addphonenumber()
      addmail()
    }


    def getBeverage(): Unit //abstract method

    def dates(): Unit
  }

  // Inheritance.
  trait Clean {
    def availability(): Unit
  }

  class yes extends displayinfo with Clean {
    override def dates(): Unit = {
      val list1: List[String] = List("01/12/2023", "02/12/2023", "03/12/2023", "04/12/2023")
      println("The Dates available for booking are: ")
      list1.foreach(println)
      println("Enter the Dates : ")
      val date = scala.io.StdIn.readLine()

      if (date == "01/12/2023") {
        println("Hurray!! tickets are available on the chosen date")
      } else if (date == "02/12/2023"){
        println("Hurray!! tickets are available on the chosen date")
      } else if (date == "03/12/2023") {
        println("Hurray!! tickets are available on the chosen date")
      } else if (date == "04/12/2023"){
        println("Hurray!! tickets are available on the chosen date")
      }
      else{
        println(
          s"""Oops!! Tickets are not available on the $date
             |Come back later
             |Thank You for visiting
             |""".stripMargin)
        System.exit(0)
      }

    }

    override def getBeverage(): Unit = {
      availability()
      getinformation()
      println(""""Thank you for choosing our Service
                | Your tickets are reserved !!
                | Wishing you a safe and happy journey
                | NOTE: PAYMENT TO BE DONE IN PERSON AT THE AIRPORT BEFORE YOUR JOURNEY
                | """.stripMargin)
    }

    override def availability(): Unit = {
      println("Dates must be checked Properly")
      println("Please fill the Passenger Details")
    }
  }

  class no extends displayinfo with Clean {
    override def dates(): Unit = {
      println("Thank you for visiting - Come again!!")
      System.exit(0)
    }

    override def getBeverage(): Unit = {
      availability()
      getinformation()
      //
      // dates()
      println(""""Oops!! Tickets are not available on the $date
                |Come back later
                |Thank You for visiting
                |""".stripMargin)
      System.exit(0)
    }

    override def availability(): Unit = {
      println("Please fill the Passenger Details:")
    }
  }
}
object Sample {
    def main(args: Array[String]): Unit = {
      println(
        """Welcome!!
          |Planning for a Trip??
          |""".stripMargin)
      val name = new FlightTickets()
      name.profile("Flight Tickets")
      //println(name)
      val list: List[String] = List("Air India", "Air Asia", "Air India Express")
      println("The Flights available for booking are: ")
      list.foreach(println)

      var c: Tickets = null
      println(
        """Enter 0 below if not booking
          |Enter 1 below if booking
          |Booking a Ticket? """.stripMargin)

      val flightType: Int = scala.io.StdIn.readInt()
      if (flightType == 1) {
        println("Enter the Boarding Point: ")
        val boarding = scala.io.StdIn.readLine()
        println(s"your boarding point is $boarding")

        println("Enter the Destitantion: ")
        val destination = scala.io.StdIn.readLine()
        println(s"your destination is $destination")

        println("Enter the flight name: ")
        val flightName: String = scala.io.StdIn.readLine()
        c = new Tickets(flightName)

        if (flightName == "Air India") {
          println("It has 20 seats Available")
        }
        else if (flightName == "Air Asia") {
          println("It has 20 seats Available")
        }
        else if (flightName == "Air India Express") {
          println("It has 20 seats available")
        }
        else {
          println(
            s"""Sorry!, $flightName is not available for now!!
               |Come back later
               |Thank You for visiting
               |""".stripMargin)
          System.exit(0)
        }
      } else {
        c = new Tickets()
        println("Thank you and please visit again")
        System.exit(0)
      }

      c.Initial()
      c.datesavail()
      c.getBeverages()
    }
}