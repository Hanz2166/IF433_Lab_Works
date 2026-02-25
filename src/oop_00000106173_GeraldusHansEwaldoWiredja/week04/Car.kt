package oop_00000106173_GeraldusHansEwaldoWiredja.week04

class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {
    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors [intu dibuka")
    }
    override fun honk() {
        println("Ayaya! Ayaya! Mobil $brand lewat!!")
    }

    override fun accelerate() {
        super.accelerate()
        println("Mobil $brand menggunakan transmisi untuk menambah kecepatan.")
    }
}