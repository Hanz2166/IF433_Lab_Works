package oop_00000106173_GeraldusHansEwaldoWiredja.week13
import java.io.File

fun main() {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Instalasi Sistem.\n")
    println("File berhasil dibuat dan ditulis")
}
