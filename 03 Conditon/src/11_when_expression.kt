fun main() {

    val x = 20
    val y = 10
    val z = 10

    when(x) {
        (y+z) -> print("y + z = x = $x")
        else -> print("Condition is not satisfied")
    }
}
