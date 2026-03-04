package week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    // WAJIB di-override karena fungsi bekerja() bersifat abstract di Parent
    override fun bekerja() {
        println("[$nama] sedang menyampaikan materi perkuliahan dan merevisi RPKPS")
    }

    //fungsi spesifik hanya untuk dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}