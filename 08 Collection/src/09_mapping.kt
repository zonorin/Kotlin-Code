fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val squares = numbers.map { it * it }
    println(squares) // [1, 4, 9, 16, 25]
}
