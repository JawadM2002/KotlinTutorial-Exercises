package BasicsExercises

fun main(args: Array<String>) {
    if (args.size >= 2) {
        val number1 = args[0].toDoubleOrNull() // inputting first number
        val number2 = args[1].toDoubleOrNull() // inputting second number

        if (number1 != null && number2 != null) {
            val sum = number1 + number2
            val difference = number1 - number2
            val product = number1 * number2
            val quotient = number1 / number2

            println("Sum: $sum") // After adding two numbers
            println("Difference: $difference") // After subtraction
            println("Product: $product") // after multiplication
            println("Quotient: $quotient") // after division
        } else {
            println("Invalid input. Please enter valid numbers.")
        }
    } else {
        println("Insufficient no. of arguments.")
    }
}