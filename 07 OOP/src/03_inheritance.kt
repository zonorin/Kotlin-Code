open class Animal(val name : String) {
    fun eat() {
        println("$name is eating.")
    }
}

class Dog(name : String) : Animal(name) {
    fun bark() {
        println("$name is barking.")
    }
}

fun main() {
    val dog = Dog("Joki")
    dog.eat()
    dog.bark()
}
