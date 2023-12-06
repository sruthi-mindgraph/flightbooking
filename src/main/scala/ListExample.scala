object ListExample {
  def main(args: Array[String]): Unit = {
    // Create a list of strings
    val fruits: List[String] = List("Apple", "Banana", "Cherry")

    // Access elements by index
    println("First fruit: " + fruits(0))

    // Check if the list is empty
    println("Is the list empty? " + fruits.isEmpty)

    // Get the length of the list
    println("Number of fruits: " + fruits.length)

    // Add an element to the front of the list to create a new list
    val fruitsWithMango: List[String] = "Mango" :: fruits
    println("List with Mango: " + fruitsWithMango)

    // Concatenate two lists
    val moreFruits: List[String] = List("Grapes", "Orange")
    val combinedFruits: List[String] = fruits ::: moreFruits
    println("Combined lists: " + combinedFruits)

    // Map a function to each element of the list
    val upperCaseFruits: List[String] = fruits.map(fruit => fruit.toUpperCase)
    println("Fruits in uppercase: " + upperCaseFruits)

    // Filter elements based on a condition
    val longFruits: List[String] = fruits.filter(fruit => fruit.length > 5)
    println("Fruits with more than 5 letters: " + longFruits)
  }
}
