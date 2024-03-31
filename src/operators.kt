import kotlin.math.max

fun main() {
    //Arithmetic operators
    var num1 = 45
    var num2 = 42

    println(num1 + num2)
    println(num1 - num2)
    println(num1 * num2)
    println(num1 / num2)
    println(num1 % num2)


    //logic operators - and,or,not
    println(num1 < num2 && num1 != num2) //and
    println(num1 < num2 ||  num1 != num2) //or
    println(!(num1 < num2 ||  num1 != num2)) //not

    //comparison operators
    println(num1 < num2)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 >= num2)
    println(num1 == num2)
    println(num1 != num2)

    //Assignment operators
    var y = 28
    y += 2
    println(y)

    var x = 45
    x %= 2
    println(x)

}