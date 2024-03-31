class Dog(var name:String,var breed:String,var weight:Int){

    fun move(movement:String){
        println("The dog is $movement")
    }

}

fun main() {
    var dog1 = Dog("Murife","pitbull",78)
    var dog2 = Dog("Bob","Bulldog",34)

    println(dog1.breed)
    dog2.move("Running")
    dog1.move("Walking")
}