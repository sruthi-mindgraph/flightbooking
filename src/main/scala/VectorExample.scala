object VectorExample {
  def main(args: Array[String]): Unit = {
    // Creating a Vector of Strings
    val fruits: Vector[String] = Vector("Apple", "Banana", "Cherry", "Date")

    // Accessing elements by index
    val firstFruit: String = fruits(0)
    println(firstFruit)

    // Adding an element to the Vector
    val moreFruits: Vector[String] = fruits :+ "Grape"
    println(moreFruits)

    // Length of the Vector
    val vectorLength: Int = fruits.length
    println(vectorLength)

    // Iterating through the Vector
    for (fruit <- fruits) {
      println(fruit)
    }
  }
}
