open class Animal2 {
    open val sound : String = "Some sound"
}

class Dog2 : Animal2() {
    override val sound: String = "Bark"
}

fun main() {
    val animal : Animal2 = Dog2()
    println(animal.sound)
}
