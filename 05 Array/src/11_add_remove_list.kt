fun main() {

    val fruits = mutableListOf("Apple", "Banana", "Pear")

    // Add an item
    fruits.add("Melon")
    println("After adding Melon : $fruits")

    // Remove an item
    fruits.remove("Pear")
    println("After removing Pear : $fruits")

    // Remove an item by index
    fruits.removeAt(0)
    println("After removing first fruits : $fruits")
}
