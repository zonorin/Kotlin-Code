fun main() {
    val countryCodes = mutableMapOf(
        "US" to "United States",
        "KH" to "Cambodia",
        "IN" to "India"
    )

    countryCodes["UK"] = "United Kingdom"
    println(countryCodes)
}
