abstract class Vehicle {
    abstract fun drive()
}

class Car : Vehicle() {
    override fun drive() {
        println("Driving a car.")
    }
}

class Bike : Vehicle() {
    override fun drive() {
        println("Driving a bike.")
    }
}

fun main() {
    val car = Car()
    car.drive()

    val bike = Bike()
    bike.drive()
}
