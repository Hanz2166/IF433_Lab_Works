package oop_00000106173_GeraldusHansEwaldoWiredja.weeok03

fun main(){
    val e = Employee("Budi")

    //1. test validasi salary
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    //2. tes encapsulation
    e.increasePerformance()

    //3. test computed property
    println("Pajak harus dibayr: ${e.salary}")
}