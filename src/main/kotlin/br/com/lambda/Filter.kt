package br.com.lambda


fun main() {
    val myList2 = listOf("Matheus",
        "Caio",
        "Antunes",
        "Beto",
        "Paralelepipedo",
        "Ana",
        "Gio",
        "Castro Silva"
    )

    val filterList = myList2.filter { it.length > 4 }.sortedBy { it }
    println(filterList)
}