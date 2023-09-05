package KotlinFunctionsTutorials

fun displayBorder2(character: Char = '=', length: Int = 15) {
    for (i in 1..length) {
        print(character)
    }
}

fun main(args: Array<String>) {
    println("Output when no argument is passed:")
    displayBorder2()

    println("\n\n'*' is used as a first argument.")
    println("Output when first argument is passed:")
    displayBorder2('*')

    println("\n\n'*' is used as a first argument.")
    println("5 is used as a second argument.")
    println("Output when both arguments are passed:")
    displayBorder2('*', 5)

}