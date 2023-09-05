package KotlinFlowControlTutorials

fun main(args: Array<String>) {

    val first = 6
    val second = -5
    val third = 12

    val max = if (first > second) {
        if (first > third)
            first
        else
            third
    } else {
        if (second > third)
            second
        else
            third
    }

    println("max = $max")
}