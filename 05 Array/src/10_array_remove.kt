fun main() {

    val numbers = arrayOf(1, 2, 3, 4, 5)

    // remove 2
    val updatedNumbers = numbers.filter { it != 2}.toTypedArray()
    println("After removing number 2 : ${updatedNumbers.joinToString()}")

    val strings = arrayOf("A", "B", "C", "D")
    val updatedStrings = strings.filter { it != "A" }.toTypedArray()
    // "it" stand for item

    println       (strings.joinToString())
    println(updatedStrings.joinToString())

}
