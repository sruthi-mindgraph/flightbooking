object SetExample {
  def main(args: Array[String]): Unit = {
    // Creating a Set of integers
    val numberSet: Set[Int] = Set(1, 2, 3, 4, 5)
    println(numberSet)

    // Adding an element to the Set
    val updatedSet: Set[Int] = numberSet + 6
    println(updatedSet)

    // Removing an element from the Set
    val removedSet: Set[Int] = updatedSet - 3
    println(removedSet)

    // Checking if an element exists in the Set
    val containsElement: Boolean = updatedSet.contains(4)
    println(containsElement)

    // Set operations (intersection)
    val set1: Set[Int] = Set(1, 2, 3, 4, 5)
    val set2: Set[Int] = Set(3, 4, 5, 6, 7)
    val intersection: Set[Int] = set1.intersect(set2)
    println(intersection)

    // Iterating through the Set
    updatedSet.foreach(element => println(element))
  }
}
