fun greet(name: kotlin.String?) {
    println("Hello, ${name ?: "Guest"}")
}

fun main() {
    greet("Kotlin") // Hello, Kotlin
    greet(null)     // Hello, Guest
}
