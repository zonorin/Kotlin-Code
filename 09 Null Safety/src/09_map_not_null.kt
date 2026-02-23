fun main() {
    val nullableList = listOf("1", null, "3")
    val numbers = nullableList.mapNotNull { it?.toInt() }
    println(numbers) // [1, 3]
}
