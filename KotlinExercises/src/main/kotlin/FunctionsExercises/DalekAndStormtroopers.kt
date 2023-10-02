package FunctionsExercises

fun main() {
    val daleks = Daleks()
    val stormtroopers = Stormtroopers()

    println("In a galaxy far, far away...")
    stormtroopers.patrol()

    println("Meanwhile, in the Doctor Who universe...")
    daleks.exterminate()

    println("The Daleks and Stormtroopers, iconic villains in their respective franchises!")
}

class Daleks {
    fun exterminate() {
        println("Daleks: Exterminate! Exterminate!")
    }
}

class Stormtroopers {
    fun patrol() {
        println("Stormtroopers: Move along! Move along!")
    }
}
