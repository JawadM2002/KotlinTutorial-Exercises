package BasicsExercises

fun main() {
    val input = 5
    println("The input value is defined as $input")
    printFactors(input)
}

fun printFactors(input: Int) {
    var myResult: Long = 1
    for (i in 1..input) {
        myResult *= i.toLong()
    }
    println("The factorial of $input is $myResult")
}