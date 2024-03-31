class Employee(var firstname:String,var age:Int,gender:String,var position:String,var salary:Double){

    fun role(task:String){
        println("The role is $task")

    }
}

fun main() {

    var employee1 =Employee("Nara",45,"Female","Managing director",435676.00)
    var employee2 =Employee("Brenda",34,"Female","Human Resource Manager",67890.00)

    println(employee1.firstname)
    println("Employee1 is ${employee1.age} years old")
}