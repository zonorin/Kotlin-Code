class Person(val name: String, var age: Int) {
    fun introduce() {
        println("Hi, my name is $name and I am $age years old")
    }
}

fun main() {
    val person = Person("Dmitry", 30)  //creating an object
    person.introduce()
}
