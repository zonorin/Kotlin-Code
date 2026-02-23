fun main() {

    println("Hello".addExclamation())
}

fun String.addExclamation(): String {
    return "$this!"
    // or return this + "!"
}
