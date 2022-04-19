package functions

// fun structure with body
fun camelCase(x: Int, y: Int): Int {
    // ...body
    return x * y
}

// fun as expression
fun expressionFun(args: String) = "using a function as $args"


fun main() {
    println(camelCase(2, 4)) // 8
    println(expressionFun("expression")) // using a function as expression
}
