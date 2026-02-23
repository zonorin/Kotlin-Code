interface Printer {
    fun printDocument(document : String) {
        println("Printing document : $document")
    }
}

interface Scanner {
    fun scanDocument() : String {
        val scannedContent = "Scanned Document Content"
        println("Scanning document...")
        return scannedContent
    }
}

class AllInOnePrinter : Printer, Scanner {
    fun faxDocument(document : String) {
        println("Faxing document : $document")
    }
}

fun main() {

    val allInOne = AllInOnePrinter()
    allInOne.printDocument("MyReport.pdf")

    val scannedDoc = allInOne.scanDocument()
    println("Scanned Content : $scannedDoc")

}
