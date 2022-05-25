package br.com.functions


// local
fun topLevelFun(): Unit {
    val topLevel: String = "Top level variable"

    // closure
    fun localFunction() {
        println(topLevel.length)
    }

    localFunction()
}


// member br.com.functions
class Sample {

    fun memberFunction() {
        {/* ...... */}
    }
}
