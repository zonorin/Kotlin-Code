fun main() {

    val booleanArray = booleanArrayOf(true, false, true, false)

    // Access and print elements
    println("First Element: ${booleanArray[0]}")                    // True

    // Modify an element
    booleanArray[1] = true
    println("Modified Array : ${booleanArray.joinToString()}")      // true, true, true, false

    // Count true values
    println("Number of true values : ${booleanArray.count { it }}") // output 3
}
