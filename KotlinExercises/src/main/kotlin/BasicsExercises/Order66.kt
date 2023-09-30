package BasicsExercises

fun main() {
    val order66: Boolean = true

    if (order66) {
        executeOrder66()
    } else {
        println("It's treason, then. ARGGHHHHHH!")
    }
}

fun executeOrder66() {
    println("Order 66 has been executed. Execute all Jedi.")
}
