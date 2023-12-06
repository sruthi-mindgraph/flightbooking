//trait Color {
//  val color: String
//}
//
//abstract class Shapes(val name: String) {
//  def area(): Double
//
//  def shapeType(): String = "1D"
//
//  def displayInfo(): Unit = {
//    println(s"Shape: $name")
//    println(s"Area: ${area()}")
//    println(s"Type: ${shapeType()}")
//  }
//}
//
//class Point(private val x: Double, private val y: Double) {
//  def getX: Double = x
//  def getY: Double = y
//}
//
//class Circles(val radius: Double, val color: String) extends Shapes("Circle") with Color {
//  def area(): Double = math.Pi * radius * radius
//  override def shapeType(): String = "2D"
//}
//
//class Squares(val side: Double, val color: String) extends Shapes(name = "Square") with Color {
//  def area(): Double = side * side
//  override def shapeType(): String = "2D"
//}
//
//class Rectangles(val length: Double, val width: Double, val color: String) extends Shapes("Rectangle") with Color {
//  def area(): Double = length * width
//  override def shapeType(): String = "2D"
//}
//
//class Triangles(val base: Double, val height: Double, val color: String) extends Shapes("Triangle") with Color {
//  def area(): Double = 0.5 * base * height
//  override def shapeType(): String = "2D"
//}
//
//class Line(val startPoint: Point, val endPoint: Point) extends Shapes("Line") {
//  def area(): Double = 0.0
//
//  // Method to calculate the distance between two points
//  def calculateDistance(): Double = {
//    val deltaX = endPoint.getX - startPoint.getX
//    val deltaY = endPoint.getY - startPoint.getY
//    math.sqrt(deltaX * deltaX + deltaY * deltaY)
//  }
//  override def shapeType(): String = "1D"
//}
//
//object Main {
//  def main(args: Array[String]): Unit = {
//    val circle = new Circles(5.0, "Red")
//    val square = new Squares(5, "Black")
//    val rectangle = new Rectangles(4.0, 6.0, "Blue")
//    val triangle = new Triangles(8.0,2.0,"Red")
//
//    // Create a Point instance
//    val myPoint = new Point(3.0, 4.0)
//
//    // Accessing x and y using getter methods
//    val xValue = myPoint.getX
//    val yValue = myPoint.getY
//
//    println(s"Point: x = $xValue, y = $yValue")
//
//    val line = new Line(myPoint, new Point(5.0, 7.0))
//
//    circle.displayInfo()
//    println()
//
//    square.displayInfo()
//    println()
//
//    rectangle.displayInfo()
//    println()
//
//    triangle.displayInfo()
//    println()
//
//    // Display information about the Line and its distance
//    line.displayInfo()
//    println(s"Distance between points: ${line.calculateDistance()}")
//  }
//}
//
trait Color {
  val color: String
}

abstract class Shapes(val name: String) {
  def area(): Double

  // Overloaded method to indicate shape type with dimension
  def shapeType(dimension: String)

  def displayInfo(): Unit = {
    println(s"Shape: $name")
    println(s"Area: ${area()}")
    println(s"Type: ${shapeType("1D")}") // Default to 1D
  }
}

class Point(private val x: Double, private val y: Double) {
  def getX: Double = x
  def getY: Double = y
}

class Circles(val radius: Double, val color: String) extends Shapes("Circle") with Color {
  def area(): Double = math.Pi * radius * radius

  // Overriding the shapeType method
  override def shapeType(dimension: String) = "2D"
}

class Squares(val side: Double, val color: String) extends Shapes(name = "Square") with Color {
  def area(): Double = side * side
  override def shapeType(dimension: String) = "2D"
}

class Rectangles(val length: Double, val width: Double, val color: String) extends Shapes("Rectangle") with Color {
  def area(): Double = length * width
  override def shapeType(dimension: String) = "2D"
}

class Triangles(val base: Double, val height: Double, val color: String) extends Shapes("Triangle") with Color {
  def area(): Double = 0.5 * base * height
  override def shapeType(dimension: String) = "2D"
}

class Line(val startPoint: Point, val endPoint: Point) extends Shapes("Line") {
  def area(): Double = 0.0

  // Method to calculate the distance between two points
  def calculateDistance(): Double = {
    val deltaX = endPoint.getX - startPoint.getX
    val deltaY = endPoint.getY - startPoint.getY
    math.sqrt(deltaX * deltaX + deltaY * deltaY)
  }
  override def shapeType(dimension: String) = "1D"
}

object Main {
  def main(args: Array[String]): Unit = {
    val circle = new Circles(5.0, "Red")
    val square = new Squares(5, "Black")
    val rectangle = new Rectangles(4.0, 6.0, "Blue")
    val triangle = new Triangles(3.0,12.0,"Red")

    // Create a Point instance
    val myPoint = new Point(3.0, 4.0)

    // Accessing x and y using getter methods
    val xValue = myPoint.getX
    val yValue = myPoint.getY

    println(s"Point: x = $xValue, y = $yValue")

    val line = new Line(myPoint, new Point(5.0, 7.0))

    circle.displayInfo()
    println()

    square.displayInfo()
    println()

    rectangle.displayInfo()
    println()

    triangle.displayInfo()
    println()

    // Display information about the Line and its distance
    line.displayInfo()
    println(s"Distance between points: ${line.calculateDistance()}")
  }
}