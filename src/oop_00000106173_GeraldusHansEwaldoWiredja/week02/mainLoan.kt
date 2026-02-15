package oop_00000106173_GeraldusHansEwaldoWiredja.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println(" --- APLIKASI PEMINJAMAN BUKU PERPUSTAKAAN --- ")
    println("Nama Buku Yang Ingin Dipinjam: ")
    val bookTitle = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.next()

    println("Pinjam untuk berapa lama: ")
    var loanDuration = scanner.nextInt()

    scanner.nextline()

    if(loanDuration < 0) {
        loanDuration = 1
    }
    val l1 = Loan(bookTitle, borrower, loanDuration)
    println("Status: Pendaftaran Selesai. ")
    println("BookTitle      : ${L1.bookTitle}")
    println("Peminjam       : ${L1.borrower}")
    println("Durasi         : ${L1.loanDuration} hari")
    println("Total Denda    : ${L1.calculateFine()}")
}