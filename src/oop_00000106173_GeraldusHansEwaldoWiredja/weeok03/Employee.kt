package oop_00000106173_GeraldusHansEwaldoWiredja.weeok03

class Employee (val name: String){
    var salary: Int = 0
        set(value) {
            println("Mencoba get gaji ke: $value")
            this.salary = value
        }
}