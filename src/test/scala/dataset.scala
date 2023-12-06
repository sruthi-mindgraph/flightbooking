//import com.opencsv.CSVReader
//import java.io.FileReader
//libraryDependencies += "com.opencsv" % "opencsv" % "5.6"
//
//
//object DatasetExample extends App {
//  // Define the case class representing your data
//  case class MyData(id: String, name: String)
//
//  // Function to read the dataset from a CSV file
//  def readDataset(filename: String): List[MyData] = {
//    val reader = new CSVReader(new FileReader(filename))
//    val data = reader.readAll()
//
//    // Convert the CSV data to a List of MyData
//    data.asScala.map(row => MyData(row(0), row(1))).toList
//  }
//
//  // Path to your CSV file
//  val filename = "path/to/your/example.csv"
//
//  // Read the dataset
//  val dataset = readDataset(filename)
//
//  // Process the dataset
//  dataset.foreach { data =>
//    println(s"ID: ${data.id}, Name: ${data.name}")
//  }
//}
