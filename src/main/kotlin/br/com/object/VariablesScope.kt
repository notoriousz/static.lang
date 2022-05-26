package br.com.`object`

// static variable
val inTheFile = "Hello"

fun test() {
    // static variable
    val funScopeVariable = "World"

    if (funScopeVariable is String) {
        val blockVariable = "Disponible only in the block"
    }

    println("$funScopeVariable and $inTheFile") // not necessary instances
}

class VariablesScope {
    // need instance
    val instanceVariable = "Instance"

    companion object {
        @JvmStatic
        val staticInTheClass = "Static in the class" // not useful
    }
}


fun main() {
    // with instance
    VariablesScope().instanceVariable

    // without instance because is static
    VariablesScope.staticInTheClass
}

