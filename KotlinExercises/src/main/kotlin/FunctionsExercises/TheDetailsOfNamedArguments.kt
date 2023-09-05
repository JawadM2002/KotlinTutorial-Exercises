package FunctionsExercises

fun printDetails(name: String, age: Int, city: String) { // function takes three named arguments with specific types
    println("Name: $name")
    println("Age: $age")
    println("City: $city")
}

fun main() {
    printDetails(name = "Jawad Mahmud", age = 20, city = "London") // explicitly provides details
}