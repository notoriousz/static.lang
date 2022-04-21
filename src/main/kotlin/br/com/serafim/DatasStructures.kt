package br.com.serafim

import java.util.StringJoiner

fun main() {
    // creating a array -> in array we cannot add and remove itens
    val array = arrayOf("Matheus", "Carlos", "Fabio")
    println(array.joinToString())

    // creating a list -> in list we can add and remove, is more dinamic
    val list = mutableListOf<String>("Giovanna", "Leia", "Vanessa")
    list.add(0, "João")
    println(list.joinToString())

    // creating sets -> the elements doesn't repeat
    val set = setOf<String>("Vigesimal", "Pedro", "Carla")
    println(set.joinToString())


    // creating maps
    val map = mutableMapOf(
        "Name" to "Matheus",
        "ID" to 1
    )
    println(map.toString())
}