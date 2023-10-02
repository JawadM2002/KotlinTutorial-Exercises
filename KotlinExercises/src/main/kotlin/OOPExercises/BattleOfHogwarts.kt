package OOPExercises

class Wizard(val name: String, var isAlive: Boolean = true, var hasWand: Boolean = true) {
    override fun toString(): String {
        return "$name (Alive: $isAlive, Has Wand: $hasWand)"
    }

    fun duel(opponent: Wizard) {
        if (isAlive && hasWand) {
            opponent.isAlive = false
            opponent.hasWand = false
            println("$name duels and defeats ${opponent.name}!")
        }
    }
}

fun main() {
    println("The Battle of Hogwarts")
    println("-----------------------")

    val harry = Wizard("Harry Potter")
    val voldemort = Wizard("Lord Voldemort")

    println("The battle rages on...")
    println("The fate of Hogwarts hangs in the balance.")

    var round = 1

    while (harry.isAlive && voldemort.isAlive) {
        println("\nRound $round")
        println("------------")

        harry.duel(voldemort)
        voldemort.duel(harry)

        round++
    }

    println("\nThe Battle of Hogwarts is over...")
    if (harry.isAlive) {
        println("Harry Potter and his allies have triumphed.")
    } else {
        println("Lord Voldemort and his forces have triumphed.")
    }
}
