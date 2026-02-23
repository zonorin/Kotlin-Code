fun main() {

    var arr = arrayOf(1, 2, 3, 4, 5)
    arr = addElement(arr, 10)
    println("Elements in Array : ")
    for (element in arr) {
        print(" $element")
    }
    println("")
}

fun addElement(arr: Array<Int>, element: Int): Array<Int> {
    val mutableArr = arr.toMutableList()
    mutableArr.add(element)
    return mutableArr.toTypedArray()
}
