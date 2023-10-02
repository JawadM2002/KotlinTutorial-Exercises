package FunctionsExercises

fun calculateCircleArea(radius: Double, pi: Double = 3.14): Double {
    return pi * radius * radius
}

fun main() {
    val radius = 4.0
    val area = calculateCircleArea(radius)
    println("Area of circle with radius $radius = $area")
}