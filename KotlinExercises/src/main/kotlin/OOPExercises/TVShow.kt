package OOPExercises

class TVShow(val show: String, val country: String, val year: Int) {
    fun displayInfo() {
        println("TV Show Information:")
        println("TV Show Name: $show")
        println("Country of origin: $country")
        println("Year it started: $year")
    }
}

fun main() {
    val show = TVShow("Doctor Who", "United Kingdom", 1963)
    val showtwo = TVShow("The Office", "United States", 2005)
    show.displayInfo()
    showtwo.displayInfo()
}