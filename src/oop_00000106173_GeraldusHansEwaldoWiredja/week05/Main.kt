package week05

import oop_00000106173_GeraldusHansEwaldoWiredja.week05.MathHelper

fun main() {
    val dosen1 = Dosen("Pak Dante", "000010")
    val admin1 = Admin("Pak Vergilius")

    //polymorphic collection: List yang berisi tipe parent, tapi isinya objek anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        //Panggilan runtime polymorphic
        pegawai.bekerja()

        //pegawai.mengajar() // INI ERROR KARENA REFERENSINYA PEGAWAI
        //SMART CASTING DENGAN is DAN when
        when (pegawai) {
            is Dosen ->{
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()} //Saat casting tidak perlu manual casting(as)
            is Admin -> {
                println("=> Admin detected")
                pegawai.doAdminWork()
            }
        }
        println("----------------------------------------------------------")
    }
    println("\n=== math")
    val math = MathHelper()

    println("Luas Persegi: ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(5,3)}")
    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")
}