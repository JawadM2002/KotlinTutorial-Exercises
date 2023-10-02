package OOPExercises

class TimeLord(val name: String, var regeneration: Int = 0, var lives: Int = 13) {
    fun regenerate() {
        if (lives > 0) {
            lives--
            regeneration++
        }
    }

    override fun toString(): String {
        return "$name (Regeneration: $regeneration, Lives: $lives)"
    }
}

class Dalek(val serialNumber: String, var operational: Boolean = true) {
    override fun toString(): String {
        return "Dalek-$serialNumber (Operational: $operational)"
    }
}

fun main() {
    println("The Time War Perspective")
    println("------------------------")

    val timeLords = mutableListOf(
        TimeLord("The Doctor"),
        TimeLord("Romana"),
        TimeLord("Rassilon")
    )

    val dalekFleet = mutableListOf(
        Dalek("D1"),
        Dalek("D2"),
        Dalek("D3"),
        Dalek("D4"),
        Dalek("D5"),
        Dalek("D6")
    )

    println("The Time Lords, champions of time and space, stand united.")
    println("The Dalek Empire, relentless and unyielding, advances.")

    var battleRound = 1

    while (timeLords.isNotEmpty() && dalekFleet.isNotEmpty()) {
        println("\nBattle Round $battleRound")
        println("------------------------")

        val randomTimeLord = timeLords.random()
        val randomDalek = dalekFleet.random()

        println("$randomTimeLord faces off against $randomDalek.")
        randomDalek.operational = false
        randomTimeLord.regenerate()

        if (randomTimeLord.lives <= 0) {
            println("$randomTimeLord has fallen.")
            timeLords.remove(randomTimeLord)
        }

        if (!randomDalek.operational) {
            println("$randomDalek is defeated.")
            dalekFleet.remove(randomDalek)
        }

        battleRound++
    }

    println("\nThe Time War rages on...")
    if (timeLords.isEmpty()) {
        println("The Dalek Empire stands triumphant.")
    } else {
        println("The Time Lords endure, but at a great cost.")
    }
}

