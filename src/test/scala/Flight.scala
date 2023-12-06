////// Define a Flight class to represent flight details
////class Flight(val id: String, val origin: String, val destination: String, var seatsAvailable: Int) {
////  override def toString: String = s"Flight $id: $origin to $destination, Seats Available: $seatsAvailable"
////}
////
////// Define a Booking class to represent a flight booking
////class Booking(val flight: Flight, val numSeats: Int) {
////  require(numSeats > 0, "Number of seats should be greater than zero.")
////  require(flight.seatsAvailable >= numSeats, "Insufficient seats available.")
////
////  // Update the seats available after booking
////  flight.seatsAvailable -= numSeats
////
////  override def toString: String = s"Booking for ${numSeats} seat(s) on ${flight.toString}"
////}
////
////// Define a BookingSystem class to manage flights and bookings
////class BookingSystem {
////  var flights: List[Flight] = Nil
////
////  def welcome(): Unit={
////    println(
////      """Welcome!!
////        |Planning to book a flight?""".stripMargin)
////  }
////
////  // Add a new flight to the system
////  def addFlight(flight: Flight): Unit = {
////    flights = flight :: flights
////  }
////
////  // Display the list of available flights
////  def displayFlights(): Unit = {
////    println("Available Flights:")
////    flights.foreach(println)
////  }
////
////  // Book seats on a specific flight
////  def bookFlight(flightId: String, numSeats: Int): Option[Booking] = {
////    flights.find(_.id == flightId) match {
////      case Some(flight) =>
////        if (flight.seatsAvailable >= numSeats) {
////          val booking = new Booking(flight, numSeats)
////          Some(booking)
////        } else {
////          println("Insufficient seats available.")
////          None
////        }
////
////      case None =>
////        println("Flight not found.")
////        None
////    }
////  }
////}
////
////object FlightBookingApp extends App {
////
////  // Create an instance of BookingSystem
////  val bookingSystem = new BookingSystem
////
////  // Add some flights to the system
////  bookingSystem.addFlight(new Flight("F001", "CityA", "CityB", 50))
////  bookingSystem.addFlight(new Flight("F002", "CityB", "CityC", 30))
////  bookingSystem.addFlight(new Flight("F003", "CityA", "CityC", 20))
////
////  bookingSystem.welcome()
////  // Display available flights
////  bookingSystem.displayFlights()
////
////  // Example: Book seats on a flight
////  val bookingResult = bookingSystem.bookFlight("F001", 2)
////  bookingResult.foreach(booking => println(s"Booking Successful: $booking"))
////
////  // Display updated available flights after booking
////  bookingSystem.displayFlights()
////}
//
//// Abstract class representing a ticket
//abstract class Ticket {
//  def displayDetails(): String
//}
//
//// Define a Flight class to represent flight details
//class Flight(val id: String, val origin: String, val destination: String, var seatsAvailable: Int) extends Ticket {
//  override def displayDetails(): String = s"Flight $id: $origin to $destination, Seats Available: $seatsAvailable"
//}
//
//// Define a Booking class to represent a flight booking
//class Booking(val flight: Flight, val numSeats: Int) extends Ticket {
//  require(numSeats > 0, "Number of seats should be greater than zero.")
//  require(flight.seatsAvailable >= numSeats, "Insufficient seats available.")
//
//  // Update the seats available after booking
//  flight.seatsAvailable -= numSeats
//
//  override def displayDetails(): String = s"Booking for ${numSeats} seat(s) on ${flight.displayDetails()}"
//}
//
//// Define a BookingSystem class to manage flights and bookings
//class BookingSystem {
//  var tickets: List[Ticket] = Nil
//
//  def welcome(): Unit = {
//    println(
//      """Welcome!!
//        |Planning to book a flight?""".stripMargin)
//  }
//
//
//  // Add a new ticket to the system
//  def addTicket(ticket: Ticket): Unit = {
//    tickets = ticket :: tickets
//  }
//
//  // Display the list of available tickets
//  def displayTickets(): Unit = {
//    println("Available Tickets:")
//    tickets.foreach(ticket => println(ticket.displayDetails()))
//  }
//
//  // Book seats on a specific flight
//  def bookFlight(flightId: String, numSeats: Int): Option[Booking] = {
//    tickets.find {
//      case flight: Flight => flight.id == flightId
//      case _ => false
//    } match {
//      case Some(flight: Flight) =>
//        if (flight.seatsAvailable >= numSeats) {
//          val booking = new Booking(flight, numSeats)
//          addTicket(booking)
//          Some(booking)
//        } else {
//          println("Insufficient seats available.")
//          None
//        }
//
//      case None =>
//        println("Flight not found.")
//        None
//    }
//  }
//}
//
//object FlightBookingApp extends App {
//
//  // Create an instance of BookingSystem
//  val bookingSystem = new BookingSystem
//
//  // Add some flights to the system
//  bookingSystem.addTicket(new Flight("F001", "CityA", "CityB", 50))
//  bookingSystem.addTicket(new Flight("F002", "CityB", "CityC", 30))
//  bookingSystem.addTicket(new Flight("F003", "CityA", "CityC", 20))
//
//  bookingSystem.welcome()
//  // Display available tickets
//  bookingSystem.displayTickets()
//
//  // Example: Book seats on a flight
//  val bookingResult = bookingSystem.bookFlight("F001", 2)
//  bookingResult.foreach(booking => println(s"Booking Successful: ${booking.displayDetails()}"))
//
//  // Display updated available tickets after booking
//  bookingSystem.displayTickets()
//}
//
//
