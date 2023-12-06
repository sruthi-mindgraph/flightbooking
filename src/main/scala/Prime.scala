object Prime {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) {
      false
    } else {
      var i = 2
      while (n / 2 >= i) {
        if (n % i == 0)
          return false
        i += 1
      }
      return true
    }

  }
  def findPrimesInRange(start: Int, end: Int): List[Int] = {
    (start to end).filter(isPrime).toList
  }


  def main(args: Array[String]): Unit = {
    val start = 1
    println("Enter the end value: ")
    val end = scala.io.StdIn.readInt() // Change the range as per your requirement

    val primeNumbers = findPrimesInRange(start, end)
    val sum = primeNumbers.sum

    println(s"Prime numbers between $start and $end are: $primeNumbers")

    println(s"The sum of the prime number between $start and $end is: $sum")
  }
}
