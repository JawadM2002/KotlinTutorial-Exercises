package FunctionsExercises

fun reverseString(input: String): String{
    return input.reversed() // returns string in reverse order (Not Reverse-Flash!)
}

fun main() {
    val string = "doof"
    println("Original: $string")
    val reversestring = reverseString(string)
    println("Reversed: $reversestring")
}