package br.com.`object`

data class CarTwo(val name: String, val color: String)

class Bike(val name: String, val color: String)

fun main() {
    // the difference between data classes and classes is

    // data classes has more features inside it, as destructuring, equals methods etc...
    // and is used to have data with behaviors

    val c1 = CarTwo("Car", "Orange")
    val c2 = CarTwo("Car", "Orange")
    println(c1 == c2) // call the method equals
    println(c1.toString()) // have the toString method

    val (name, color) = c1 // using destructuring
    println("$name, $color dectructuring")

    // class doesn't have the adittional features
    val b1 = Bike("Caloi", "Green")
    val b2 = Bike("Caloi", "Green")
    println(b1 == b2) // doesn't have the equals
    println(b1.toString()) // doesn't have the toString method

}