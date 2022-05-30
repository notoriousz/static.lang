package br.com.lambda

fun main() {
    // use an anonymous function as parameter or sign in variable
    val sum2 = { x: Int, y:Int -> x + y }
    println(sum2(3, 4))
}