object RegularExpression extends App{
  val patternString = "a+".r
  val inputString = "aaaab"

  val matchesIterator = patternString.findAllIn(inputString)
  matchesIterator.foreach(println)
  // Output: a aaaa


}
