package br.com.collections


class Arrays {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            // Array
            val myList = Array(10) { it * 2 }
            println(myList[1]) // get
            myList[1] = 1234 // set
            println(myList[1])

            // ArrayList
            val myList2 = arrayListOf<String>("Matheus", "Serafim")
            println(myList2[1]) // get
            myList2[1] = "Cacau" // set
            println(myList2[1])
            myList2.add("lION") // add in the final index
            println(myList2.toString())
        }
    }
}

