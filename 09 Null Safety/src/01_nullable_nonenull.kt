fun main() {
    var s1 : String = "testing"
    // s1 = null   => compilation error
    println(s1)

    var s2 : String? = "testing"
    s2 = null
    println(s2)
}
