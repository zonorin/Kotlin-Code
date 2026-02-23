fun main(args: Array<String>) {

    // Range using .. operator
    println()

    // Range with step
    val range1 = 1..10 step 3
    println("Range 1..10 step 2: $range1")
    for (i in range1) {
        println("$i ")
    }
    println()

    // Character range
    val charRange = 'a'..'e'
    println("Char range a..e: $charRange")
    for (c in charRange) {
        println("$c ")
    }
}
