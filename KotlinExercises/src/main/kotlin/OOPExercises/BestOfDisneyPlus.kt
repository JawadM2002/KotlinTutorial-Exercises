package OOPExercises

// BestDisneyPlusShows.kt

class DisneyPlusShow(val title: String, val genre: String, val yearReleased: Int) {
    override fun toString(): String {
        return "$title ($yearReleased) - $genre"
    }
}

fun main() {
    val disneyPlusShows = listOf(
        DisneyPlusShow("The Mandalorian", "Science Fiction", 2019),
        DisneyPlusShow("WandaVision", "Superhero", 2021),
        DisneyPlusShow("The Falcon and the Winter Soldier", "Superhero", 2021),
        DisneyPlusShow("Loki", "Superhero", 2021),
        DisneyPlusShow("Ahsoka", "Science Fiction", 2023),
        DisneyPlusShow("The Imagineering Story", "Documentary", 2019),
        DisneyPlusShow("The World According to Jeff Goldblum", "Documentary", 2019),
        DisneyPlusShow("Gravity Falls", "Animation", 2012),
        DisneyPlusShow("Star Wars: The Clone Wars", "Science Fiction", 2008),

    )

    println("Some of the best shows on Disney+ include:")

    for (show in disneyPlusShows) {
        println(show)
    }

    println("Enjoy watching these fantastic shows on Disney+!")
}
