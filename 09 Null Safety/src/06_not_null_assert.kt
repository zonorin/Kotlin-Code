fun main() {
    // Non-Null Assertion (!!) means it is not null
    val name: String? = "Kotlin"
    println(name!!.length) // 6

    val nullableName: String? = null
    println(nullableName!!.length) // throw error
}
