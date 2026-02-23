fun main(args: Array<String>) {

    // Elvis operator (?:)
    val name : String = "Guest"
    val displayName = name ?: "Guest"
    println("Hello, $displayName")

    // Not-null assertion operator (!!)
    val str : String? = "Kotlin"
    val length = str!!.length
    println("Length is $length")

    // Safe call operator (?.)
    val nullableStr : String? = null
    val nullableLength = nullableStr?.length
    println("Safe call result: $nullableLength")
}
