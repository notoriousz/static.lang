package br.com.`object`


// getters and setter are useful when we want to add a complex behavior
// for basic data and manipulation don't need

class AnimalTest {

    constructor(name: String){
        this.name = name
    }

    var name: String
        // field make reference to variable
        get() = "My name is $field"
        set(theName) {
            field = theName.takeIf { theName.isNotEmpty() } ?: "Anonymous"
        }
}

fun main() {
    val A1 = AnimalTest("CAVALO")
    println(A1.name)
}