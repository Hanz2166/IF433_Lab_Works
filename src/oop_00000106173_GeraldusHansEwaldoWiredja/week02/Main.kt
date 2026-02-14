package oop_00000106173_GeraldusHansEwaldoWiredja.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.'in')

    println(" --- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // Bersihkan buffer newline (Penyakit klasik Scanner!)

    //Validasi di sisi pemanggil (Main)
    if (nim. length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        // Program berhenti di sini untuk mahasiswa ini, tidak membuat objek
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Instansiasi Objek karena data sudah aman
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai. ")
    }

    print("Pilih Jalur(1. Reguler, 2. Umum): ")
    val type =scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Teradaftar di: ${s1.major} dengan GPA awal ${s1.GPA}")
    }else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
}