package oop_00000106173_GeraldusHansEwaldoWiredja.week11

fun main() {
    println("=== Test Extension Functions ===")
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