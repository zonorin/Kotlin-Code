fun main() {
    val arrayList = arrayListOf(1, 2, 3)
    arrayList.add(4)
    arrayList.remove(2)

    println(arrayList)
    println("Size : ${arrayList.size}")
    println("Contains 3: ${arrayList.contains(3)}") // true if it is in array, false if it is not in array
    println("Element at index 1: ${arrayList[1]}")
}
