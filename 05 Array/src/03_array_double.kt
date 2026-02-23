fun main() {

    val doubleArray = doubleArrayOf(1.1, 2.2, 3.3, 4.4)
    // Access and print element
    println("First Element: ${doubleArray[0]}") //1.1

    // Modify an element
    doubleArray[3] = 5.5
    println("Modified Array : ${doubleArray.joinToString()}")  // 1.1, 2.2, 3.3
    println("Sum : ${doubleArray.sum()}") // output 12.1
}
