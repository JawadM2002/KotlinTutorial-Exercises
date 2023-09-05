package KotlinBasicsTutorials

fun main(args: Array<String>) { // function block starts here
// Expression
    val a = 8
    val b = 15
    val max: Int

    max = if (a > b) a else b
    println("$max")

    // Blocks
    val flag = true

    if (flag == true) {      // start of if block
        print("Hey ")
        print("jude!")
    }                        // end of if block
}                            // end of function bloc