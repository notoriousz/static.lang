package functions

import java.util.StringJoiner

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

fun namedArguments(
    name: String,
    yo: Int = 23,
    single: Boolean = false
) {
    println("$name, $yo, $single")
}

fun main() {
    // default args
    funWithDefaultParameters()
    funWithDefaultParameters("Reassign First", "Reassign Second")

    println("--------------------------------------------")

    // to call y and use x as default, we need to use the name of the argument on declaration
    settingOneAsDefault(y = 25)


    println("--------------------------------------------")
    // we can call a fun with no named arguments

    namedArguments(
        "Math", // Declare just the value
        single = true // Declare key and value
    )

}
