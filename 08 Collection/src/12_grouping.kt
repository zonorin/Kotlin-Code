fun main() {
    val words = listOf("apple", "banana", "apricot", "blueberry")

    val grouped = words.groupBy { it.first() }
    println(grouped)
    // {a=[apple, apricot], b=[banana, blueberry]}
}
