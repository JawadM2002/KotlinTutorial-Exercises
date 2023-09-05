package KotlinOOPTutorials

class Light {

    // property (data member)
    private var isOn: Boolean = false

    // member function
    fun lightOn() {
        isOn = true
    }

    // member function
    fun lightOff() {
        isOn = false
    }

    fun displayLightStatus(lamp: String) {
        if (isOn == true)
            println("$lamp Light's on.")
        else
            println("$lamp Light's off.")
    }
}

fun main(args: Array<String>) {

    val l1 = Light() // create l1 object of Lamp class
    val l2 = Light() // create l2 object of Lamp class

    l1.lightOn()
    l2.lightOff()

    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")
}