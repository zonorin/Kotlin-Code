fun main(args: Array<String>) {

    // Using the 'is' operator
    val number : Any = 22
    if (number is Int) {
        println("$number is an Integer")
    }

    // Using the 'as' operator to cast
    val anyValue : Any = "Hello, Kotlin"
    val stringValue :  String = anyValue as String
    println(stringValue)

    // Function reference
    fun greet(name: String) {
        println("Hello, $name!")
    }
    // Using function reference operator ::
    val greetReference: (String) -> Unit = :: greet
    greetReference("World")

    // Spreed operator
    val numbers = intArrayOf(1, 2, 3)
    val list = listOf(*numbers.toTypedArray()) // Convert IntArray to Array<Int>
    println(list)
}
