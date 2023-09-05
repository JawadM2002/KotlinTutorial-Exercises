package KotlinBasicsTutorials

fun main(args: Array<String>) {

    // Arithmetic Operators
    val number1 = 2.8
    val number2 = 4.5
    var result: Double

    result = number1 + number2 // addition
    println("number1 + number2 = $result")

    result = number1 - number2 // subtraction
    println("number1 - number2 = $result")

    result = number1 * number2 // multiplication
    println("number1 * number2 = $result")

    result = number1 / number2 // division
    println("number1 / number2 = $result")

    result = number1 % number2 // modulus
    println("number1 % number2 = $result")

    // Concatenation of strings
    val begin = "You were my brother, Anakin. "
    val middle = "I loved you."
    val end = " - Obi-Wan Kenobi, Star Wars - Episode III: Revenge of the Sith"
    val complete = begin + middle + end
    println(complete)

    // Assignment operator, e.g. +=, -=, *=
    var number = 15
    number *= 7
    println("Number is: $number")


}