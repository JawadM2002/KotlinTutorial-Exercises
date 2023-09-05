package FunctionsExercises.Recursion

tailrec fun sumNumbers(n: Int, currentSum: Int = 0): Int {
    if (n == 0) {
        return currentSum
    }

    return sumNumbers(n - 1, currentSum + n)
}

fun main() {
    val n = 7
    val sum = sumNumbers(n)
    println("Sum of numbers from 1 to $n: $sum")
}