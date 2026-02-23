fun main() {

    val fruits = arrayOf<String>("Apple", "Banana", "Pear", "Grape")

    println( fruits.get(0)) // Apple
    println( fruits.get(3)) // Grape

    // set the value at 3rd index
    fruits.set(3, "Watermelon")
    println(fruits.get(3))  // Watermelon
}
