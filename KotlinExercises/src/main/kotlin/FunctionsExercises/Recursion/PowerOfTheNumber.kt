package FunctionsExercises.Recursion

fun calculatePower(base: Int, exponent: Int): Int {
    return if (exponent == 0) {
        1 // returns as 1 if the exponent of a number is 0
    } else {
        base * calculatePower(base, exponent - 1)
    }
}

fun main() {
    val base = 3
    val exponent = 4
    val result = calculatePower(base, exponent)
    println("$base raised to the power of $exponent: $result")
}