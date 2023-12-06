object Fibonacci {
  def fibonacci(n: Int): Int = {
      if (n <= 1) {
        n
      } else {
        fibonacci(n - 1) + fibonacci(n - 2)
      }
    }

    def main(args: Array[String]): Unit = {
      val n = 10 // You can change this to the number of Fibonacci numbers you want to generate.

      if (n <= 0) {
        println("Please enter a positive integer.")
      } else {
        println("Fibonacci Series:")
        for (i <- 0 until n) {
          print(fibonacci(i) + " ")
        }
      }
    }
  }
