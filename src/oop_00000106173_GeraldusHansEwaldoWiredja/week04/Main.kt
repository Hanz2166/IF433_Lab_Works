package oop_00000106173_GeraldusHansEwaldoWiredja.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Cara ---")
    val myCar = Car("Hyundai")
    myCar.openTrunk()   // Memanggil method untuk milik densiri
    myCar.honk()        // Memanggil method yang sudah dioverride
    myCar.accelerate()  // Memanggil gabungan method Parent dan Child
}