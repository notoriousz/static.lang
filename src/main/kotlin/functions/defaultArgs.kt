package functions

fun funWithDefaultParameters(
    // using default parameters
    firstArg: String = "Default parameter one",
    secondArg: String = "Default parameter two"
) {
    println("First: $firstArg\nSecond: $secondArg")
}

fun settingOneAsDefault(x: Int = 0, y: Int) {
    // using just one default parameter
    println("x is default $x\ny: is seated $y")
}


fun main() {
    funWithDefaultParameters()
    funWithDefaultParameters("Reassign First", "Reassign Second")

    println("--------------------------------------------")

    // to call y and use x as default, we need to use the name of the argument on declaration
    settingOneAsDefault(y = 25)
}
