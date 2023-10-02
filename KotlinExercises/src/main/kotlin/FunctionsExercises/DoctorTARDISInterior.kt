package FunctionsExercises

fun main() {
    val doctorTARDISInteriors = mapOf(
        "First and Second Doctors" to "Classic Console Room: The original hexagonal control room with roundels and a vintage feel.",
        "Third Doctor" to "Classic Console Room (Various redesigns): Modified version of the classic room with changes to the console " +
                "and roundels",
        "Fourth Doctor" to "Gothic Console Room: A dark and Gothic-inspired design with imposing arches and rich colors.",
        "Fifth, Sixth and Seventh Doctor" to "Retro Console Room: a retro version of the console room, noticeably the keypads and monitor " +
                "screens",
        "Eighth Doctor" to "Steampunk Atmospheric Console Room: A blend of Victorian and futuristic elements, with a lighting and colour palette " +
                "which gives a warm and inviting atmosphere.",
        "Ninth Doctor" to "Coral Console Room: Organic, coral-like structures with a more natural and vibrant look.",
        "Tenth Doctor" to "Coral Console Room (Redesign): A modified version of the Coral Room with added features and details.",
        "Eleventh Doctor" to "Series 5 Console Room: A steampunk-inspired interior with brass and whimsical design elements.",
        "Twelfth Doctor" to "Toyota Console Room: A high-tech control room with a clean and futuristic appearance, with roundels from " +
                "Series 9 onwards.",
        "Thirteenth Doctor" to "Crystalline Console Room: A more crystalline and contemporary design with a timeless feel."
    )

    println("TARDIS Interiors by Doctor:")

    doctorTARDISInteriors.forEach { (doctor, interior) ->
        println("$doctor: $interior") // this will print the mapping for each TARDIS interior that each of the Doctor's incarnations use
    }

}
