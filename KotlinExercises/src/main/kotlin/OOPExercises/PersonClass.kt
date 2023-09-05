package OOPExercises

class PersonClass(val name: String, val age: Int, val country: String) {
    fun print() {
        println("Name of person: $name")
        println("Age of person: $age")
        println("Country: $country")
    }
}

fun main() {
    val personClass = PersonClass("Jawad Mahmud", 20, "London")
    personClass.print()
}