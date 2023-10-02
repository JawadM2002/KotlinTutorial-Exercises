package OOPExercises

class BollywoodFilm(val title: String, val year: Int, val director: String) {
    override fun toString(): String {
        return "$title ($year), directed by $director"
    }
}

class BestOfBollywood {
    private val films = mutableListOf<BollywoodFilm>()

    fun addFilm(film: BollywoodFilm) {
        films.add(film)
    }

    fun listFilms() {
        println("Best Bollywood Films:")
        for ((index, film) in films.withIndex()) {
            println("${index + 1}. $film")
        }
    }

    fun introduction() {
        println("Here are some of the best Bollywood films:")
    }
}

fun main() {
    val bestOfBollywood = BestOfBollywood()

    // Adding Bollywood films to the list
    bestOfBollywood.addFilm(BollywoodFilm("Lagaan", 2001, "Ashutosh Gowariker"))
    bestOfBollywood.addFilm(BollywoodFilm("Dilwale Dulhania Le Jayenge", 1995, "Aditya Chopra"))
    bestOfBollywood.addFilm(BollywoodFilm("Pathaan", 2023, " Siddharth Anand"))
    bestOfBollywood.addFilm(BollywoodFilm("3 Idiots", 2009, "Rajkumar Hirani"))
    bestOfBollywood.addFilm(BollywoodFilm("Mughal-e-Azam", 1960, "K. Asif"))
    bestOfBollywood.addFilm(BollywoodFilm("Taare Zameen Par", 2007, "Aamir Khan and Amole Gupte"))
    bestOfBollywood.addFilm(BollywoodFilm("Jawan", 2023, "Atlee"))

    // Displaying the list of films
    bestOfBollywood.introduction()
    bestOfBollywood.listFilms()
}
