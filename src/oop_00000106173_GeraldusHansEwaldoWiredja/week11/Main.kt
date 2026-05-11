package oop_00000106173_GeraldusHansEwaldoWiredja.week11

fun main() {
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

    println("\n=== Test Extension Functions ===")
    println("Alen".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=== Test Run Function ===")
    val result = "kotlin".run{
        println("Memproses kata: ${this}")  //'this' bisa dihilangkan (implicit)
        length * 2
    }
    println("Hasil Kalkulasi run: $result")
}