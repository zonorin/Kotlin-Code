fun main() {

    var arr = arrayOf(1, 2, 3, 4, 5)
    arr = removeElement(arr, 2)
    println("Elements in Array : ")
    for (element in arr) {
        print(" $element")
    }
}

fun removeElement(arr: Array<Int>, element: Int): Array<Int> {
    val mutableArray = arr.toMutableList()
    mutableArray.remove(element)
    return mutableArray.toTypedArray()
}
