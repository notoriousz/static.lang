package br.com.functions

class NumberTest(val number: Int)


infix fun NumberTest.eMaiorQue(numberTwo: NumberTest): Boolean = this.number > numberTwo.number

// infix is the prefixe of the middle operator between two operands


fun main() {
    val n1 = NumberTest(2)
    val n2 = NumberTest(3)

    println(n1 eMaiorQue n2) // using infix function
    println(n2.eMaiorQue(n1)) // another case to use infix function

}