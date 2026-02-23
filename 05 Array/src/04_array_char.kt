fun main() {

    val charArray = charArrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G')

    // Access and print element
    println("Second element : ${charArray[1]}")  // B

    // Modify an element
    charArray[6] = 'Z'
    println("Modified Array : ${charArray.joinToString()}") // A B C D E F Z

    // Print all elements
    for (char in charArray) {
        print("$char ")  // OUTPUT : A B C D E F Z
    }
}
