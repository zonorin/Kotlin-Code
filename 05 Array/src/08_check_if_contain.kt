fun main() {

    val numbers = arrayOf(1, 2, 3, 4, 5)

    // check if 3 exist
    if (numbers.contains(3)) {
        println("Number 3 exists in the array")
    } else {
        println("Number 3 does not exists in the array")
    }


    val fruits = arrayOf("Apple", "Banana", "Pear", "Grape")

    // check if "Banana" exists
    if (fruits.contains("Banana")) {
        println("Banana exists in fruits")
    } else {
        println("Banana does not exists in fruits")
    }
}
