import java.io.File
import kotlin.io.path.writeLines

fun main() {
    val scoresFile = File("scores.txt")
    scoresFile.forEachLine { println(it) }

    val sortedLines = scoresFile.readLines().sorted()
    val outputFile = File("sorted-scores.txt").toPath()
    outputFile.writeLines(sortedLines)
}

//toPath() converts our file to an instance of path.
// This opens up makes specific APIs available