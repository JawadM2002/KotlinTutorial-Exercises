package FlowControlExercises

fun main() {
    println("Welcome to the world of anime powers!")
    println("You have three choices:")
    println("1. Transform into a Super Saiyan")
    println("2. Eat a Devil Fruit")
    println("3. Have a Tailed Beast")

    val choice = readLine()?.toIntOrNull()

    when (choice) {
        1 -> {
            println("You've chosen to transform into a Super Saiyan!")
            println("Get ready to unleash your incredible power!")
        }
        2 -> {
            println("You've chosen to eat a Devil Fruit!")
            println("Be prepared for amazing abilities, but remember, you'll lose your ability to swim.")
        }
        3 -> {
            println("You've chosen to have a Tailed Beast!")
            println("Harness the power of your Tailed Beast, but remember to keep it under control!")
        }
        else -> {
            println("Invalid choice. Please select a valid option (1, 2, or 3).")
        }
    }
}