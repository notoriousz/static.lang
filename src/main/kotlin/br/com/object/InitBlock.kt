package br.com.`object`

class InitBlock(name: String) {
    // another form to use constructor, but isn't useful
    val myName: String
    init {
        this.myName = name
    }
}