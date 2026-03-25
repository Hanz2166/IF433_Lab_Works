package week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) { println("Memproses Rp$amount via gopay server") }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) { println("Mengkontak bank untuk Rp$amount via creditcard") }
}