package oop_00000106173_GeraldusHansEwaldoWiredja.week13
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Instalasi Sistem.\n")
    println("File berhasil dibuat dan ditulis")
    file.appendText("Line 2: Menambahkan Konfigurasi Baru.\n")
    println("Teks berhasil di-append")

    println("=== TEST READ TEXT ===")
    val fullContent = file.readText()
    println("Membaca Sekaligus:\n${fullContent}")

    println("=== TEST READ LINES ===")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->
        println("Isi index $line: $line")
    }
}
