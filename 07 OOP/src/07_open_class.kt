open class Vehicle1 {
    fun startEngine() {
        println("Starting Engine.")
    }
}

class Car1 : Vehicle1() {
    fun drive() {
        println("Driving the car.")
    }
}

fun main() {
    val car = Car1()
    car.startEngine()
    car.drive()
}
