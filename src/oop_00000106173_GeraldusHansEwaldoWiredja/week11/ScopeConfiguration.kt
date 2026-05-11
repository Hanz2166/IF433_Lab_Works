package oop_00000106173_GeraldusHansEwaldoWiredja.week11

data class User(var name: String = "", var age: Int = 0)

fun main(){
    println("=== Test Apply ===")
    val user = User().apply{
        name = "Alex"
        age = 25
    }
    println(user)

    println("\n=== Test Also ===")
    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("Log sebelum ditabmbah: $it")
    }.add(4)
    println("Setelah ditambah: $numbers")

    println("\n=== Test With ===")
    with(user){
        println("User Detail -> Nama: $name, Umur: $age")
    }
}