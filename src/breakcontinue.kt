fun main() {
    for(number in 30..40){
        if (number == 35){
            break
        }
        println(number)
    }


    //continue statement
    for(character in 'a'..'d'){
        if (character == 'd')
            continue
        println("Character is $character")
    }
}