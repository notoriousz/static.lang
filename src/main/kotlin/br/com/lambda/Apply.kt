package br.com.lambda

class Calc123 {
    var result: Int = 0

    fun calcs(x: Int, y: Int) {
        result += (x + y)
    }
}

fun main() {
    val myCalc = Calc123()
    // I can to climb the applies lambda
    myCalc.apply { calcs(4, 4) }.apply { calcs(2, 2) }
    println(myCalc.result)
}