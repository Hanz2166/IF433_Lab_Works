package week01

fun main() {
    //REFACTOR: Gunakan val dan hapus tipe data eksplisit
    var name = "Dante"
    var score = 99

    //Concatenation gaya lama
    println("Nama: $name, Nilia: $score")
    val grade = when(score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
}