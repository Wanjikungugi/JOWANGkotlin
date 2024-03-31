import java.util.Scanner

fun main() {
    var reader=Scanner(System.`in`)

    println("Enter day of the week:")
    var day = reader.nextInt()

    var result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day of the week"
    }
    println("The day is $result")
}