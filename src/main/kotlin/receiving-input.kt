import java.io.File

fun main() {
    print("Enter a filename: ")
    val filename = readln()
    println("You entered $filename")

    val isValidFile = File(filename).isFile
    if (isValidFile) {
        println("It's a valid file")
    } else {
        println("It's not a valid file")
    }
}