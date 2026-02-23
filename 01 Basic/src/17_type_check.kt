fun main() {
    val obj: Any = "Kotlin"
    if (obj is String) {    // Type check
        println(obj.length) // Smart casting
    }

    val number: Any = 123
    val castedNumber = number as Int // Explicit casting
    println(castedNumber)
}