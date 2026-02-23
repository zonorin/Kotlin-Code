fun main() {

    var i = 1;
    while (i <= 10) {
        if (i == 6) {
            i++
            continue  // continue one iteration
        }
        println("The number is $i")
        i++
    }
}
