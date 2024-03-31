import java.util.Scanner
fun main() {
    println("Grading System")
    println("Student's name:")
    val name = readLine()

    println("Student's mark:")
    val mark = readLine()?.toIntOrNull()

    if (mark == null || mark !in 0..100) {
        println("Invalid mark. Please enter a valid mark between 0 and 100.")
        return
    }

    val grade = calculateGrade(mark)

    println("Student: $name")
    println("Mark: $mark")
    println("Grade: $grade")
}

fun calculateGrade(mark: Int): String {
    return when {
        mark >= 80 -> "A"
        mark >= 70 -> "B"
        mark >= 60 -> "C"
        mark >= 40 -> "D"
        else -> "E"
    }
}
