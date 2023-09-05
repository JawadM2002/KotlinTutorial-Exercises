package KotlinFlowControlTutorials

fun main(args: Array<String>) {

    val digit = 5

    if (digit > 0) {
        print("Positive")
    } else if (digit < 0) {
        print("Negative")
    } else {
        print("zero")
    }
}