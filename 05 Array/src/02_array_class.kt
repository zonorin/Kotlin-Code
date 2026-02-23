fun main() {

    // Array of size 5, elements are 0, 2, 4, 6, 8
    // index (i) is for 0, 1, 2, 3, 4
    // and use to multiply by 2
    val numbers = Array(5) { i -> i * 2 }

    println(numbers.joinToString())
}
