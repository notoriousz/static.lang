package br.com.controller

fun forLoops() {
    val myList = arrayOf<Int>(1, 2, 3, 4, 5)

    // basic
    for (item: Int in myList) {
        println("block: $item")
    }

    // expression
    for (item: Int in myList) println("expression: $item")

    // range
    for (i in 1..3) {
        println(i)
    }

    // range with steps and regression
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    // for with the index and value as destructuring
    for ((index, value) in myList.withIndex()) {
        println("the element at $index is $value")
    }

}

fun main() {
    forLoops()

    val array = arrayOf(1, 2, 3)
    println(array.joinToString())

}