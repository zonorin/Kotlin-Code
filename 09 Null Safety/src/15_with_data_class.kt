data class User1(val name: String?, val age: Int?)

fun main() {
    val user1 = User1("John", 21)
    // access properties
    println(user1.name) // John
    println(user1.age)  // 21
    // auto-generated toString()
    println(user1) // User1(name=John, age=21)
}
