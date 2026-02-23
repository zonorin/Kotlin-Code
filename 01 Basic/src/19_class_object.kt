// class definition
class Person(val name: String, val age: Int) {
    // method inside class
    fun greet() {
        println("Hello, My name is $name and I am $age years old")
    }
}

fun main() {
    // creating an object of the .Person class
    val person = Person("Norin", 20)
    person.greet() // calling the greet method
}
