fun main() {
    // safe cast (as?) mean if cast fails, return null
    val obj : Any? = "Kotlin"
    val str : String? = obj as? String
    val num : Int? = obj as? Int

    println(str)
    println(num)
}
