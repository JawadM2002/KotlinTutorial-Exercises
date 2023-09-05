package KotlinFunctionsTutorials

fun callMe() { // accepts no argument
    println("Printing from callMe() function.")
    println("Printing in Progress.")
}

fun main(args: Array<String>) {
    callMe()
    println("Printing outside from callMe() function.")
}