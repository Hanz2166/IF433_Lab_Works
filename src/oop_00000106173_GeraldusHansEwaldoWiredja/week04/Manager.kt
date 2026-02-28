package oop_00000106173_GeraldusHansEwaldoWiredja.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang mengikuti rapat divisi")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 250.000
    }
}