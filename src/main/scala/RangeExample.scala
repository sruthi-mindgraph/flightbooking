object RangeExample {
  def main(args: Array[String]): Unit = {
    // Creating a range from 1 to 5 (inclusive)
    val rangeInclusive: Range.Inclusive = 1 to 5

    // Creating a range from 1 until 5 (exclusive)
    val rangeExclusive: Range = 1 until 5

    // Iterating through the inclusive range
    println("Inclusive Range:")
    for (num <- rangeInclusive) {
      println(num)
    }

    // Iterating through the exclusive range
    println("Exclusive Range:")
    for (num <- rangeExclusive) {
      println(num)
    }
  }
}
