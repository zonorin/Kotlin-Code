class Summation {
    fun sum(a : Int, b : Int) : Int {
        return a + b
    }

    fun sum(a : Int, b : Int, c : Int) : Int {
        return a + b + c
    }
}

fun main() {
    val mysum = Summation()
    println(mysum.sum(2,3))
    println("My number is ${ mysum.sum(2, 3) }")

    println(mysum.sum(2,3,4))
}
