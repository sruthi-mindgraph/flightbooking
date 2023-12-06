object namedArguments {
  //named arguments
  def named(organization: String = "ABC", empId: Int, empName: String): String = {
    (s"Emp Id: $empId, Emp Name: $empName, organization: $organization")
  }

  def main(args: Array[String]): Unit = {
    println(named(empId = 1, empName = "AAA"))
  }
}

//object defaultArguments{
//  def default(empId: Int, empName: String, organization: String="ABC"): String={
//    (s"Emp Id: $empId, Emp Name: $empName, organization: $organization")
//  }
//
//  def main(args: Array[String]): Unit = {
//    println(default(1, "AAA"))
//  }
//}

