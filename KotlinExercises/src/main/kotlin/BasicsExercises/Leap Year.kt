package BasicsExercises

fun main(args: Array<String>) {

    val year = 2003
    var leap = false // set to false as default

    if (year % 4 == 0) { // if the value is divisible by 4
            leap = true // it is a leap year
    } else
        leap = false // not a leap year

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}