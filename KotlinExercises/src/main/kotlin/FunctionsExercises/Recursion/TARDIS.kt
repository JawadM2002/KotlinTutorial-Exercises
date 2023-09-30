package FunctionsExercises

// TARDIS.kts

fun main() {
    val tardis = TARDIS("Time and Relative Dimension in Space")

    println("Welcome to the TARDIS control room!")
    println("This is the ${tardis.getName()} (TARDIS for short).")
    println("It's a time machine and spacecraft from Doctor Who.")
    println("Let's take a journey through time and space!")

    tardis.travelTo("London, Modern Day")
    tardis.travelTo("Mars, 2059")
    tardis.travelTo("New York, 2099")
    tardis.travelTo("Birmingham, 1919")

    println("We've had some amazing adventures in the TARDIS!")
}

class TARDIS(private val name: String) {
    fun getName(): String {
        return name
    }

    fun travelTo(destination: String) {
        println("The TARDIS is traveling to $destination...")
        // Logic for time and space travel would go here.
        println("Arrived at $destination!")
    }
}
