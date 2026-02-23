fun main() {
    val numbers = mutableSetOf(1, 2, 3)
    numbers.add(4)
    numbers.add(2)  // duplicate won't be added
    println(numbers)
}
