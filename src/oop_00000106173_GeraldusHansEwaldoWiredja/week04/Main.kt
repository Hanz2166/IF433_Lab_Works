package oop_00000106173_GeraldusHansEwaldoWiredja.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Cara ---")
    val myCar = Car("Hyundai", 4)
    myCar.openTrunk()   // Memanggil method untuk milik densiri
    myCar.honk()        // Memanggil method yang sudah dioverride
    myCar.accelerate()  // Memanggil gabungan method Parent dan Child

    println("\n--- Testing Cara ---")
    val myelectricCar = ElectricCar("Tesla", 4, 90)

    myelectricCar.openTrunk()
    myelectricCar.accelerate()
    myelectricCar.accelerate()

    println("\n--- Testing Office Hierarchy ---")
    val manager = Manager("Dante", 10.000.000)
    val coder = Developer("Cathy", 9.000.000, "kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    coder.work()
    println("Bonus Developer: Rp ${coder.calculateBonus()}")
}