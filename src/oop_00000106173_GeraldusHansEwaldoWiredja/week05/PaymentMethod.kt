package oop_00000106173_GeraldusHansEwaldoWiredja.week05

abstract class PaymentMethod (val accountName : String) {
    abstract fun processPayment(amount: Double);
}