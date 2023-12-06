trait Color {
    val color: String
  }

  abstract class Shapes(val name: String) {
    def area(): Double

    // Overloaded method to indicate shape type with dimension
    def shapeType(dimension: String): String


    def displayInfo(color: String): Unit = {
      println(s"Shape: $name")
      println(s"Area: ${area()}")
      println(s"Type: ${shapeType("1D")}") // Default to 1D
      println(s"Color: $color")
    }
  }

  class Point(private val x: Double, private val y: Double) {
    def getX: Double = x

    def getY: Double = y
  }

  class Circles(val radius: Double, override val color: String) extends Shapes("Circle") with Color {
    def area(): Double = math.Pi * radius * radius

    // Overriding the shapeType method
    override def shapeType(dimension: String): String = "2D"
  }

  class Squares(val side: Double, override val color: String) extends Shapes("Square") with Color {
    def area(): Double = side * side

    // Overriding the shapeType method
    override def shapeType(dimension: String): String = "2D"
  }

  class Rectangles(val length: Double, val width: Double, override val color: String) extends Shapes("Rectangle") with Color {
    def area(): Double = length * width

    // Overriding the shapeType method
    override def shapeType(dimension: String): String = "2D"
  }

  class Triangles(val base: Double, val height: Double, override val color: String) extends Shapes("Triangle") with Color {
    def area(): Double = 0.5 * base * height

    // Overriding the shapeType method
    override def shapeType(dimension: String): String = "2D"
  }

  class Line(val startPoint: Point, val endPoint: Point) extends Shapes("Line") {
    def area(): Double = 0.0

    // Method to calculate the distance between two points
    def calculateDistance(): Double = {
      val deltaX = endPoint.getX - startPoint.getX
      val deltaY = endPoint.getY - startPoint.getY
      math.sqrt(deltaX * deltaX + deltaY * deltaY)
    }

    // Overriding the shapeType method
    override def shapeType(dimension: String): String = "1D"
  }

  object Main {
    def main(args: Array[String]): Unit = {
      val circle = new Circles(5.0, "Black")
      val square = new Squares(5, "Green")
      val rectangle = new Rectangles(4.0, 6.0, "Pink")
      val triangle = new Triangles(3.0, 12.0, "Yellow")

      // Create a Point instance
      val myPoint = new Point(3.0, 4.0)

      // Accessing x and y using getter methods
      val xValue = myPoint.getX
      val yValue = myPoint.getY

      println(s"Point: x = $xValue, y = $yValue")

      val line = new Line(myPoint, new Point(5.0, 7.0))

      circle.displayInfo(circle.color)
      println()

      square.displayInfo(square.color)
      println()

      rectangle.displayInfo(rectangle.color)
      println()

      triangle.displayInfo(triangle.color)
      println()

      // Display information about the Line and its distance
      line.displayInfo(color="Green")
      println(s"Distance between points: ${line.calculateDistance()}")
    }
  }

