fun main() {

    val fruits = arrayOf<String>("Apple", "Banana", "Pineapple", "Strawberry", "Mango")
    if ("Mango" in fruits) {
        println("Mango exists in fruits")           // check if Mango in array or not
    } else {
        println("Mango does not exists in fruits")
    }


    val numbers = arrayOf(1, 2, 3, 4, 5)
    if (10 in numbers) {
        println("10 exists in numbers")
    } else {
        println("10 does not exists in numbers")
    }
}
