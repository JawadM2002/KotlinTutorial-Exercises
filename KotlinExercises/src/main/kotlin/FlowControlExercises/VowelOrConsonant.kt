package FlowControlExercises

fun main() {
    val input = 'a' // a, e, i, o, u are vowels
    // val inputagain = 'b' // every other letter is a consonant

    val char = input.lowercaseChar()

    if (char in listOf('a', 'e', 'i', 'o', 'u'))
    {
        println("The character '$input' is a vowel.")
    }
    else
    {
        println("The character '$input' is a consonant.")
    }
}