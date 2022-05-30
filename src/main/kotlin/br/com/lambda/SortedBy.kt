package br.com.lambda

fun main() {
    val myList = listOf("Matheus", "Caio", "Antunes", "Beto")
    val myListSorted = myList.sortedBy { it } // it means each item of the list
    println(myListSorted)
}