package oop_00000106173_GeraldusHansEwaldoWiredja.week04

class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors [intu dibuka")
    }
}