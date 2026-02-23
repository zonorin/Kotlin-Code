fun main() {
    println(factorial(5)) // output 120
}

fun factorial(n : Int) : Int {
    return if (n == 1) 1 else n * factorial(n - 1)
}
