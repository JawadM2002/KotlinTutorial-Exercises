package FunctionsExercises.Recursion

fun main(args: Array<String>) {
    println("Enter a number:")
    val input = readLine()

    if (input != null) {
        val num = input.toInt()
        val factorial = multiplyNumbers(num)
        println("Factorial of $num = $factorial")
    } else {
        println("Invalid input")
    }
}

fun multiplyNumbers(num: Int): Long {
    return if (num >= 1)
        num.toLong() * multiplyNumbers(num - 1)
    else
        1
}
