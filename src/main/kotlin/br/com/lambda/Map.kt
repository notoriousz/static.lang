package br.com.lambda

fun main() {
    val myList3 = listOf("Matheus", "Caio", "Antunes", "Beto")
    // map is used to transform the data, filter not
    // this is the uniq difference between
    println(myList3.map { it.uppercase() })
}