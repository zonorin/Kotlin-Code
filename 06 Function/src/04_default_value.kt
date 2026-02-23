fun main() {
    greetWithDefault()
    greetWithDefault("Norin")
}

fun greetWithDefault(name : String = "Guest") {
    println("Hello $name!")
}
