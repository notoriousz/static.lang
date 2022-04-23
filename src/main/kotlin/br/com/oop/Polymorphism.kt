package br.com.oop

// Polymorphism samples

abstract class Car {
    abstract fun provideEnergy()
}


class EletricCar : Car() {

    override fun provideEnergy() {
        println("Turn on at the power plug")
    }

}


class CombustionCar : Car() {

    override fun provideEnergy() {
        println("Insert gasoline os alcohol")
    }

}