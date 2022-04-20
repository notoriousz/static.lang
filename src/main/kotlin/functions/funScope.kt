package functions


// local functions
fun topLevelFun(): Unit {
    val topLevel: String = "Top level variable"

    // closure
    fun localFunction() {
        println(topLevel.length)
    }

    localFunction()
}


// member functions
class Sample {

    fun memberFunction() {
        {/* ...... */}
    }
}
