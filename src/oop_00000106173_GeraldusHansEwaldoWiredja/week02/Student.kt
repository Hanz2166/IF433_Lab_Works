package oop_00000106173_GeraldusHansEwaldoWiredja.week02

class Student(
    val name: String,
    val nim: String,
    var major: String,
    var GPA: Double = 0.0,
){
    init {
        if (nim.length != 5){
            println("WARNING: Objek terbuat dengan ($nim) yang tidak valid!")
            println("Data Mahasiswa $name mungkin akan bermasalah di sistem.")
        } else{
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

    /*Secondary Constructor
    Wajib memanggil Primary Constructor menggunakan 'this()'*/
    constructor (name: String, nim: String) : this(name, nim, major, "Non-matriculated") {
    println("LOG: Menggunakan constructor jalur umum(Tanpa Jurusan).")

}