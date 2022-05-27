package br.com.functions

inline fun transaction(function: () -> Unit) {
    println("connect")
    try {
        function()
    } finally {
        println("final")
    }
}

fun main() {
    transaction {
        // THIS SCOPE IS ABOUT THE PARAM FUNCTION
        // SQL
        // SQL
        // SQL
    }
}