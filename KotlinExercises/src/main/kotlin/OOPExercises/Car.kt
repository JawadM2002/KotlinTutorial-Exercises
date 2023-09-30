package OOPExercises

class Car(val make: String, val model: String, val year: Int) {
    fun displayInfo() {
        println("Car Information:")
        println("Make: $make")
        println("Model: $model")
        println("Year: $year")
    }
}
fun main() {
    val car = Car("Mercedes-Benz", "AMG GT", 2023)
    car.displayInfo()
}