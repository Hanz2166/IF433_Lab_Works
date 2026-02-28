package oop_00000106173_GeraldusHansEwaldoWiredja.week04

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name is working")
    }
    open fun calculateBonus(): Int {
        return (baseSalary*10) / 100
    }
}