package FlowControlExercises

fun main() {
    println("Choose a character from the following list:")
    println("1. Luke Skywalker")
    println("2. Darth Vader")
    println("3. Obi-Wan Kenobi")
    println("4. Yoda")
    println("5. Kylo Ren")
    println("6. Mace Windu")
    println("7. Darth Maul")
    println("8. Darth Sidious")
    println("9. Grand Inquisitor")
    println("10. Ahsoka Tano")

    val choice = readLine()?.toIntOrNull()

    val lightsaber = when (choice) {
        1 -> "Luke's green lightsaber"
        2 -> "Darth Vader's red lightsaber"
        3 -> "Obi-Wan Kenobi's blue lightsaber"
        4 -> "Yoda's green lightsaber"
        5 -> "Kylo Ren's crossguard lightsaber"
        6 -> "Mace Windu's purple lightsaber"
        7 -> "Darth Maul's double-bladed red lightsaber"
        8 -> "Darth Sidious's twin lightsabers"
        9 -> "Grand Inquisitor's double-bladed spinning red lightsaber"
        10 -> "Ahsoka Tano's dual wield lightsabers"
        else -> "No lightsaber available for your choice"
    }

    println("You've chosen a lightsaber:")
    println(lightsaber)
}
