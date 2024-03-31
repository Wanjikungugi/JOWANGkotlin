import java.util.Scanner
fun main() {
    println("Welcome to the Simple Calculator")
    println("Enter the first number:")
    val num1 = readLine()?.toDoubleOrNull()

    println("Enter the operator (+, -, *, /):")
    val operator = readLine()

    println("Enter the second number:")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 == null || num2 == null || operator !in arrayOf("+", "-", "*", "/")) {
        println("Invalid input. Please enter valid numbers and operator.")
        return
    }

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else null
        else -> null
    }

    if (result != null) {
        println("Result: $result")
    } else {
        println("Error: Division by zero")
    }
}
