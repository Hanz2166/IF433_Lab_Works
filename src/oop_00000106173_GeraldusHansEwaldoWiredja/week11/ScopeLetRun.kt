package oop_00000106173_GeraldusHansEwaldoWiredja.week11

fun main() {
    println("=== Test Let Function ===")
    val name: String? = "Alexander"

    //Mengeksekusi blok hanya jika objek tidak null
    val length = name?.let{
        println("Nama terdeteksi: $it") //'it' menunjuk pada name
        it.length//Mengembalikan nilai expression terakhir
    }
    println("Length nama: $length")
}