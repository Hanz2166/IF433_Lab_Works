package oop_00000106173_GeraldusHansEwaldoWiredja.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary){
    override fun work() {
        println("$name mengkoding dengan menggunakan $programmingLanguage")
    }
}