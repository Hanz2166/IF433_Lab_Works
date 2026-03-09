package oop_00000106173_GeraldusHansEwaldoWiredja.week05

class EWallet (accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if(balance >= amount) {
            balance -= amount
            println("Trasaksi berhasil. Sisa saldo: $balance")
        } else {
            println("Transaksi gagal. Saldo tidak mencukupi.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up saldo $amount berhasil. Balance sekarang: $balance")
    }
}