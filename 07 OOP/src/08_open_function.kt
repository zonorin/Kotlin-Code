open class Shape1 {
    open fun draw() {
        println("Drawing a shape.")
    }
}

class Circle1 : Shape1() {
    override fun draw() {
        println("Drawing a circle")
    }
}

fun main() {
    val shape : Shape1 = Circle1()
    shape.draw()
}
