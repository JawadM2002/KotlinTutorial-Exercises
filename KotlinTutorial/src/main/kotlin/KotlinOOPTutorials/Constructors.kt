package KotlinOOPTutorials

fun main(args: Array<String>) {

    val person1 = Constructors("Jawad", "Mahmud", 20)

    println("First Name = ${person1.firstName}")
    println("Surname = ${person1.surname}")
    println("Age = ${person1.age}")
}


class Constructors (val firstName: String, val surname: String, var age: Int) {
}