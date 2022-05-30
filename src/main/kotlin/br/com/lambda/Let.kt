package br.com.lambda

fun main() {
    val myList = listOf("Matheus", null, "Matheus", null)

    for (i in myList) {
        i?.let { println(it) }
    }
}