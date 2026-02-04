package oop_00000106173_GeraldusHansEwaldoWiredja.week01

fun main() {
    //REFACTOR: Gunakan val dan hapus tipe data eksplisit
    val name = "Dante"
    val score = 99

    //Concatenation gaya lama
    println("Nama: $name, Nilai: $score")
    val grade = when(score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
    println("Status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int): String = if (score > 75) "Lulus" else "Tidak Lulus"