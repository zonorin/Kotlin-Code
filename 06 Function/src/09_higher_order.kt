//fun applyOperation(a : Int, b : Int, operation : (Int, Int) -> Int): Int {
//    return operation(a, b)
//}
//
//fun main() {
//
//    val result = applyOperation(5, 3, {x, y -> x + y})
//    println("The result is $result") // output is 8
//}



fun main() {
    myFunction1({println("Inline function parameter")})
    val operation = getOperation()
    operation()
}

fun myFunction1(operation : () -> Unit) {
    println("I am inline function - A")
    operation()
    println("I am function - B")
}

fun getOperation() : () -> Unit{
    return { println("Returned function executed") }
}
