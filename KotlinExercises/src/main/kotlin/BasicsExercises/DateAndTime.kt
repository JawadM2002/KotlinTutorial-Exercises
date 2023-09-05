package BasicsExercises

import java.text.SimpleDateFormat
import java.util.Date

fun main() {
    val currentDateOfToday = Date()
    val Format = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val formatDate = Format.format(currentDateOfToday)
    println("Date + Time now: $formatDate")
}