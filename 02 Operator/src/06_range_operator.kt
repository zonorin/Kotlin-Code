fun main(args: Array<String>) {

    // Range using .. operator
    val range1 = 1..5
    println("Range 1..5: $range1")
    for (i in range1) {
        print("$i ")
    }
    println()

    // Exclusive range using until excludes the end value
    val range2 = 1 until 10
    println("Range 1 until 10: $range2")
    for (i in range2) {
        print("$i ")
    }
    println()

    // Reverse range
    val range3 = 5 downTo 1
    println("Range 5 downTo 1: $range3")
    for (i in range3) {
        print("$i ")
    }
    println()
}
