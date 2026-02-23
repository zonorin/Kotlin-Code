fun main() {

    var day = 'G'
    var myday = when (day) {
        'A' -> ("Monday")
        'B' -> ("Tuesday")
        'C' -> ("Wednesday")
        'D' -> ("Thursday")
        'E' -> ("Friday")
        'F' -> ("Saturday")
        'G' -> ("Sunday")
        else -> ("Unknown day")
    }
    println(myday)
}
