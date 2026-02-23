fun main() {
    val linkedSet = linkedSetOf(3, 1, 2)
    linkedSet.add(2)
    linkedSet.add(4)
    println(linkedSet)

    linkedSet.remove(1)
    println(linkedSet)
    println(linkedSet.size)
    println(linkedSet.contains(2))
    println(linkedSet.elementAt(1))
}
