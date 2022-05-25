package br.com.functions


// we implement a method called secondOrNull at the native List class
// with an inexisting feature, get the second element in a List

fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null

fun main() {
    val myList: List<Int> = listOf(1, 2, 3, 4)
    println(myList.secondOrNull())
}
