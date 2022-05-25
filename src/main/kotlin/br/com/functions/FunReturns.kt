package functions


// fun returning the type Unit, it's optional
fun withUnitReturn(name: String?): Unit {
    if (name != null)
        println("Hello, $name!")
}

// expression returns, type it's optional
fun withOutBodyReturn(x: Int, y: Int) = x * y

fun main() {
    withUnitReturn("Matheus")
    print(withOutBodyReturn(2, 2))
}