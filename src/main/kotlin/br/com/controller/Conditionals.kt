package br.com.controller


const val a: Int = 2
const val b: Int = 1

fun ifExpression() {
    // if with block else
    if (a > b) {
        println(a)
    } else {
        println(b)
    }

    // if as expression
    val maxValue = if (a > b) a else b
    println(maxValue)


    // when expression

    when (a) {
        1 -> println("a == 1")
        2 -> println("a == 2")
        else -> {
            println("No one")
        }
    }

    when (b) {
        in -10..-1 -> println("b is negative")
        in 1..10 -> println("b is positive")
    }
}



fun main() {
    ifExpression()
}