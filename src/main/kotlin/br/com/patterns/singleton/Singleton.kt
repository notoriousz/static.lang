package br.com.patterns.singleton


object Singleton {
    fun AccessToDatabase(host: String, database: String): String = "Access to $database approved"
}

fun main() {
    println("Which database do you want to access?")

    AccessPostgres()
    AccessMongo()
}

// Using the object keyword here will automatically create a class Singleton and a single instance of it

fun AccessPostgres() {
    val postgres = "Postgres"
    println(Singleton.AccessToDatabase("localhost", postgres))
}

fun AccessMongo() {
    val mongo = "MongoDB"
    println(Singleton.AccessToDatabase("localhost", mongo))
}