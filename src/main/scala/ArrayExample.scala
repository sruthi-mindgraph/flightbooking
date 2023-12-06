object ArrayExample {
  def main(args: Array[String]): Unit = {
    // Creating an Array of Integers
    val numbers: Array[Int] = Array(1, 2, 3, 4, 5)

    // Accessing elements by index
    val firstElement: Int = numbers(0)
    val secondElement: Int = numbers(1)
    println(firstElement)
    println(secondElement)

    // Modifying an element at a specific index
    numbers(2) = 10
    for (number <- numbers) {
      println(number)
     }


    // Length of the Array
    val length: Int = numbers.length
    println(length)

    // Iterating through the Array
    for (number <- numbers) {
      println(number)
    }
  }
}
