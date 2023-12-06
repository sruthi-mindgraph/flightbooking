object SequenceExample {
  def main(args: Array[String]): Unit = {
    // Create a sequence of integers
    val numbers: Seq[Int] = Seq(1, 2, 3, 4, 5)

    // Access elements by index
    println("Element at index 2: " + numbers(2))

    // Check if the sequence is empty
    println("Is the sequence empty? " + numbers.isEmpty)

    // Get the length of the sequence
    println("Length of the sequence: " + numbers.length)

    // Append an element to the sequence to create a new sequence
    val numbersWith6: Seq[Int] = numbers :+ 6
    println("Sequence with 6: " + numbersWith6)

    // Prepend an element to the sequence to create a new sequence
    val numbersWith0: Seq[Int] = 0 +: numbers
    println("Sequence with 0: " + numbersWith0)

    // Concatenate two sequences
    val moreNumbers: Seq[Int] = Seq(7, 8, 9)
    val combinedNumbers: Seq[Int] = numbers ++ moreNumbers
    println("Combined sequences: " + combinedNumbers)

    // Map a function to each element of the sequence
    val squaredNumbers: Seq[Int] = numbers.map(n => n * n)
    println("Squared numbers: " + squaredNumbers)

    // Filter elements based on a condition
    val evenNumbers: Seq[Int] = numbers.filter(n => n % 2 == 0)
    println("Even numbers: " + evenNumbers)
  }
}
