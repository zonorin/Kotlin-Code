fun main() {

    println("Kotlin is Fun!")
    val numbers = arrayOf(1, 2, 3)

    // Add an item
    val updatedNumbers = numbers + 4      // create a new array
    println       (numbers.joinToString())
    println(updatedNumbers.joinToString())
    println("After adding 4 : ${updatedNumbers.joinToString()}")


    val strings = arrayOf("A", "B", "C")
    val newStrings = strings + "D"

    println   (strings.joinToString())
    println(newStrings.joinToString())
}
