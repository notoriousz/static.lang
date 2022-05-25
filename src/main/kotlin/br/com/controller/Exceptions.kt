@file:Suppress("UNREACHABLE_CODE")

package br.com.controller

import java.lang.invoke.WrongMethodTypeException

// All exception classes in Kotlin inherit the Throwable class


fun main() {
    // how to lance a exception
    throw Exception("Hi, there!")

    // catch exception with the block try/catch

    try {
        println("Hello")
    } catch (e: WrongMethodTypeException) {
        print(e)
    }

}