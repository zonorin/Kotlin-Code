fun main() {
    printNumbers(1,2,3,4,5)
}

fun printNumbers(vararg numbers: Int) {
    for(num in numbers) {
        println(num)
    }
}
