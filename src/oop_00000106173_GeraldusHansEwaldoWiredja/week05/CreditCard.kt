package oop_00000106173_GeraldusHansEwaldoWiredja.week05

class CreditCard (accountName: String, val limit: Double): PaymentMethod (accountName) {
    var usedAmount = 0.0

    override fun processPayment(amount: Double) {
        if(usedAmount + amount <= limit) {
            usedAmount += amount
            println("Proses pembayaran berhail")
        }else {
            println("Traksaksi di tolak. Kartu sudah mencapai limit")
        }
    }
}