package br.com.`object`



// Calling primary constructor
class ConstructorMovies(val name: String, val genre: String)


fun main() {
    val movie = ConstructorMovies("Harry Potter", "Drama")
    println("The ${movie.name} is a ${movie.genre}")
}