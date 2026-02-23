fun main() {

    var day = 'E'
    when (day) {
        'A' -> println("Monday")
        'B' -> println("Tuesday")
        'C' -> println("Wednesday")
        'D' -> println("Thursday")
        'E' -> {
            println("Friday")
            println("HAPPY DAY")
        }
        'F' -> println("Saturday")
        'G' -> println("Sunday")
        else -> println("Unknown day")
    }
}
