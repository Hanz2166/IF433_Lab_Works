package week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sednag berada di depan komputer mengurusi administrasi")
    }

    //fungsi hanya untuk admin
    fun doAdminWork() {
        println("[$nama] sedang merekap data absensi mahasiswa")
    }
}