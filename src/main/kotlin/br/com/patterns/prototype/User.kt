package br.com.patterns.prototype

data class User(val userName: String?, val id: String?, val mail: String?) {
    fun test(): String = "Hi"
}

fun main() {
    val userOne = User("Math", "1", "@123.com")
    val copyUser = userOne.copy(userName = "Lucas")

    println("$userOne and use ${userOne.test()}") // User(userName=Math, id=1, mail=@123.com)
    println("$copyUser and use ${userOne.test()}")  // User(userName=Lucas, id=1, mail=@123.com)
}