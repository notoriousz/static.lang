package br.com.oop


// using Inheritance sample

open class Animal(type: String) {
    open var animalType: String? = type
}

class Bird(type: String) : Animal(type) {

}


fun main() {
    val bentivi = Bird("Flying")
    println(bentivi.animalType)
}