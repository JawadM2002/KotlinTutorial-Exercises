package KotlinOOPTutorials

data class UserClass(val name: String, val age: Int)

fun main(args: Array<String>) {
    val me = UserClass("Jawad", 20)
    println("My Name is ${me.name}")
    println("I am ${me.age}")
}
