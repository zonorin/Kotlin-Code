fun main() {

    val numbers = arrayOf(1, 2, 3, 4, 5)
    println(numbers[2])  // Access Element at index 2
    numbers[2] = 10 // modify element
    println(numbers.joinToString()) // Output: 1, 2, 10, 4, 5
}