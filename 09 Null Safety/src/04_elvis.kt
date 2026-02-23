fun main() {
    // elvis operator (?:) means if null, return the value on the
    val nullableName: String? = null
    val length = nullableName?.length ?: 0
    println(length)
}
