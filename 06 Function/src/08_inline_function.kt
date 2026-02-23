fun main() {

    // inline function enhances the performance of higher order function.
    myFunction({ println("Inline function parameter") })
}

inline fun myFunction(operation : () -> Unit) {
    println("I am inline function - A")
    operation()
    println("I am function - B")
}
