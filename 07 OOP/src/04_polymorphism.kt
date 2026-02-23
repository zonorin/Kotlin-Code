open class Shape {
    open fun draw() {
        println("Drawing a Shape.")
    }
}

class Circle : Shape() {
    override fun draw() {
        println("Drawing a Circle.")
    }
}

class Rectangle : Shape() {
    override fun draw() {
        println("Drawing a Rectangle.")
    }
}

fun main() {
    val shapes : List<Shape> = listOf(Circle(), Rectangle())
    for (shape in shapes) {
        shape.draw()
    }
}
