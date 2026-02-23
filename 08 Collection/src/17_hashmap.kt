fun main() {
    val hashMap = hashMapOf(1 to "one", 2 to "two")
    hashMap[3] = "three"
    hashMap.remove(2)

    println(hashMap)
    println("Size : ${hashMap.size}")
    println(hashMap[1])
    hashMap.forEach { key, value -> // we need to set it
        println("Key : $key, Value: $value")
    }
}
