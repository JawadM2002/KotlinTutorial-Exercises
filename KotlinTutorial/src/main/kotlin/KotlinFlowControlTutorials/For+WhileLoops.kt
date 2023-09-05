package KotlinFlowControlTutorials

fun main(args: Array<String>) {
    // While loop
    var line = 1
    println("While Loop: ")
    while (line <= 10) {
        println("Line No. $line")
        ++line
    }
    // For loop
    println("For Loop: ")
        val comps = arrayOf("Asus, MacBook, Huawei, HP(\uD83E\uDD2E), Dell")
        for (x in comps) {
            println(x)
        }
    }
