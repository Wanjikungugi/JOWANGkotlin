fun main() {
    //Predefined function
    var y = Math.sqrt(169.0)
    println("The squareroot of 169.0 is $y")

    var x = Math.min(45,12)
    println("Minimum value is $x")

    var z = Math.max(45,12)
    println("Maximum value is $z")

    var i = Math.round(67.45)
    println(i)

    name()
    quotient(12,4)
    quotient(81,3)
    developers("Gloria",18)
    developers("Hills",20)
    developers("James",18)

}

//User defined function
fun name(){
    println("ASHERRAY")
}

fun quotient(a:Int,b:Int){

    println(a/b)
}

fun developers(name:String,age:Int){
    println("$name is $age years old")

}