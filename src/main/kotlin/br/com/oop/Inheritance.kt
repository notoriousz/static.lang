package br.com.oop


// using Inheritance sample

open class Animal {
    open var animalType: String? = null
}

class Bird(type: String) : Animal() {

    override var animalType: String? = type

}


fun main() {
    val bentivi = Bird("Flying")
    println(bentivi.animalType)
}