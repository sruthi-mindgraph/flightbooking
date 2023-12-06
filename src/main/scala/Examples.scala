//object Examples extends App{
//  val string="length"
//  println(string.length)
//}
object StringConcatenationExample extends App {

  // Using + operator for string concatenation
  //val firstName = "John"
  //val lastName = "Doe"
 // val fullName = firstName + " " + lastName
  //println("Using + operator: " + fullName)

   //Using string interpolation
//  val fullName = "John Doe"
//  val age = 25
//  println(s"Name: $fullName, Age: $age")

}
//object interpolation extends App{
//    val pi=3.143678
//    println(f"The value of pi: $pi%.2f")
//  }
//
//object equality extends App{
//  val str1="ubd"
//  val str2="UBD"
//  val equalityval= str1==str2
//  println(equalityval)
//}
//object multiline extends App{
//  val multiline=
//    """string1
//      |string2
//      |string3
//      |""".stripMargin
//      println(multiline)
//}
//object split extends App{
//  val splitstring="string1,string2,string3".split(",")
//  (splitstring.foreach)(println)
//}
// Base class
//object inherit extends App{
//  class Animal {
//    // Common method
//    def sound(): String = "Some generic animal sound."
//  }
//
//  // Derived class 1
//  class Dog extends Animal {
//    // No override, using the sound method from the base class
//  }
//
//  // Derived class 2
//  class Cat extends Animal {
//    // No override, using the sound method from the base class
//  }
//
//  // Example usage
//  val dog = new Dog()
//  val cat = new Cat()
//
//  println(dog.sound()) // Output: Some generic animal sound.
//  println(cat.sound()) // Output: Some generic animal sound.
//
//}
//class MathOperations {
//  def add(a: Int, b: Int): Int = a + b
//
//  def add(a: Double, b: Double): Double = a + b
//
//  def add(a: String, b: String): String = a + b
//}
//
//object CompileTimePolymorphismExample extends App {
//  val mathOps = new MathOperations()
//
//  println(mathOps.add(1, 2))          // Output: 3
//  println(mathOps.add(3.5, 2.5))      // Output: 6.0
//  println(mathOps.add("Hello, ", "World"))  // Output: Hello, World
//}
// Base class
class Shape {
  def draw(): String = "Drawing a shape"
}

// Subclass 1
class Circle extends Shape {
  override def draw(): String = "Drawing a circle"
}

// Subclass 2
class Rectangle extends Shape {
  override def draw(): String = "Drawing a rectangle"
}

object OverrideExample extends App {
  // Creating instances
  val shape = new Shape()
  val circle = new Circle()
  val rectangle = new Rectangle()

  // Using overridden methods
  println(shape.draw())
  println(circle.draw())
  println(rectangle.draw())
}



