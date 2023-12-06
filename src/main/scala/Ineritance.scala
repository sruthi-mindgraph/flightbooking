////Scala objects
//object Inheritance extends App{
//  class Animal{
//    val creatureType="Wild"
//    protected def eat = println("eating")
//  }
//  //single class inheritance
//  class Cat extends Animal{
//    def crunch= {
//      eat
//      println("Crunch")
//    }
//  }
//  val cat = new Cat
//  cat.crunch
//
//
//
//  //counstructor(primary , auxilary)
//  class Person(name: String, age:Int){
//    def this(name:String)=this(name,0) //auxilary
//  }
//  class Adult(name:String, age:Int, idCard:String) extends Person(name)
//
//  //overriding - runtime
//  class Dog extends Animal {
//    override val creatureType ="Domestic"
//    override def eat = println("Crunch crunch")
//  }
//  val dog = new Dog
//  dog.eat
//  println(dog.creatureType)
//
//
//
//}
// Base class
class Animal(val name: String) {
  def speak(): Unit = println(s"$name makes a sound")
}

class Dog(name: String, val breed: String) extends Animal(name) {
  def bark(): Unit = println(s"$name barks loudly!")
}

object SingleInheritanceExample {
  def main(args: Array[String]): Unit = {
    val myDog = new Dog("Buddy", "Golden Retriever")
    myDog.speak()
    myDog.bark()
    println(s"${myDog.name} belongs to the breed ${myDog.breed}")
  }
}
