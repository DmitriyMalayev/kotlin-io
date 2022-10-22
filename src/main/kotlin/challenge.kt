import java.io.File
import kotlin.io.path.writeLines

fun main() {
    print("Enter a filename: ")
    val filename = readln()

    val isValidFile = File(filename).isFile
    if (!isValidFile) {
        return println("It's not a valid file")
    }
    val newOutput = File(filename).readLines()
    val parsedScores = newOutput.map { line ->
        val elements = line.split(":")
        elements[0] to elements[1]
    }
    val finalScores = parsedScores.sortedByDescending { it.second }.take(3)
    val outputPath = File("final_scores.txt").toPath()
    val outputScores = finalScores.map {
        "${it.first}:${it.second}"
    }
    outputPath.writeLines(outputScores)

}

//toPath() converts our file to an instance of path.
// This opens up makes specific APIs available