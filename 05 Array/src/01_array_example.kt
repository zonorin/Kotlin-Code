fun main() {

    val fruits1 = arrayOf        ("Apple", "Banana", "Pear", "Grape")
    val fruits2 = arrayOf<String>("Apple", "Banana", "Pear", "Grape")

    println(fruits1[0])
    println(fruits2[1])

    // create an array
    val names = arrayOf("Luffy", "JOY BOY", "Ace")

    // add item
    val newName = names + "Garp"
    println(newName.joinToString())

    // print all elements
    for (name in names) {
        println(name)
    }

    // modify an element
    names[2] = "Dragon"
    println("Modified Array : ${names.joinToString()}")
}
