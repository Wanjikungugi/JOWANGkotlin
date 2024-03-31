fun main() {
    var greeting = "Hello world"
    var firstname = "Josephine"
    var lastname = "Ngugi"

    //String concatenation
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))


    //Accessing a character in a string
    println(greeting[6])


    //Determining the index position of an element
    println(greeting.indexOf('H'))
    println(greeting.indexOf('l'))
    println(greeting.indexOf("world"))


    //Size of a string
    println(greeting.length)


    //Modifying a string
    println(greeting.uppercase())

    //String interpolation
    println("Hello there,my name is $firstname $lastname")
}