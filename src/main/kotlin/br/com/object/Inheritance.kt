package br.com.`object`

import java.util.StringJoiner


// using Inheritance sample

open class Animal(open val type: String = "")

class Bird : Animal() {
    override val type = "Flying"
}


fun main() {
    val bentivi = Bird()
    println(bentivi.type)
}