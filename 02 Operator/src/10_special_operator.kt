fun main(args: Array<String>) {

    val a = "Kotlin"
    val b = "Kotlin"
    val c = a

    println(a === b)  // Output: true (get from the string pool)
    println(a === c)  // Output: true (same reference)
    println(a == b)   // Output: true (same value)

    val d = String("Kotlin".toCharArray())
    val e = String("Kotlin".toCharArray())
    println(d === e) // Now this would be false
}
