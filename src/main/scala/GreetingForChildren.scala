object GreetingForChildren {
  def greetChild(name: String, age: Int): String = {
      if (age < 13) {
        s"Hello, $name! How are you today?"
      } else {
        s"Hi $name! I hope you're having a great day."
      }
    }

    def main(args: Array[String]): Unit = {
      val childName = "Alice"
      val childAge = 8

      val greeting = greetChild(childName, childAge)
      println(greeting)
    }
  }



