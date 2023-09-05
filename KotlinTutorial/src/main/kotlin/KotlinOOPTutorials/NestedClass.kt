package KotlinOOPTutorials

class NestedClass {
    val a = "Out the nested class."

    class Nested {
        val b = "Inside the Nested class."
        fun callMe() = "Function call from inside Nested class."
    }

}

fun main(args: Array<String>) {
    // accessing member of Nested class
    println(NestedClass.Nested().b)

    // creating object of Nested class
    val nested = NestedClass.Nested()
    println(nested.callMe())
}