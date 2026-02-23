fun main(args: Array<String>) {

    val name: String? = null
    val length = name?.length ?: 0
    println("Length is: $length")

    val city: String? = "New York"
    println(city?.uppercase())

    val person: String? = "Alice"
    person?.let {
        println("Hello, $it")
    }
}