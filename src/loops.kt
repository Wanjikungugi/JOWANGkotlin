fun main() {
     //While loop
    var number = 20
    while (number <= 25){
        println("Number is $number")
        number++
    }

    //Decrement
    var num2 = 100
    while (num2 >=95){
        println("Number is $num2")
        num2--
    }

    //Do..while loop
    var x = 34
    do {
        println(x)
        x++
    }while (x <= 40)

    //For loop
    var devices = arrayOf("laptop","phone","tablet")
    for (deice in devices){
        println("Device  is $deice")
    }
    var marks = arrayOf(20, 58, 100, 60)
    for (mark in marks){
        println("Mark is $mark")
    }

    for (mynumber in 50..60){
        println(mynumber)
    }

    for (alphabets in 'A'..'D'){
        println(alphabets)
    }









}