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

fun namedArguments(
    name: String,
    yo: Int = 23,
    single: Boolean = false
) {
    println("$name, $yo, $single")
}

fun manyArguments(vararg args: String) {
    println(args[0])
    println(args[1])
    println(args[2])
}

fun main() {
    // default args
    funWithDefaultParameters()
    funWithDefaultParameters("Reassign First", "Reassign Second")

    // to call y and use x as default, we need to use the name of the argument on declaration
    settingOneAsDefault(y = 25)

    // we can call a fun with no named arguments

    namedArguments(
        "Math", // Declare just the value
        single = true // Declare key and value
    )

    // using many arguments
    manyArguments(args = arrayOf("A", "B", "C"))
}
