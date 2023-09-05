package FunctionsExercises.Recursion

fun calculateSumOfDigits(number: Int): Int {
    return if (number < 10) {
        number
    } else {
        val lastDigit = number % 10
        val remainingDigits = number / 10
        lastDigit + calculateSumOfDigits(remainingDigits)
    }
}

fun main() {
    val number = 56789
    val sum = calculateSumOfDigits(number)
    println("Sum of digits of $number: $sum")
}