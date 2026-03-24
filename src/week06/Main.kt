package week06

// Fugsi ini Decoupled! Tidak peduli fungsi aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Mulai Checkout ... ... ...")
    method.pay(amount) //Dynamic polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n===TESTING CHECKOUT===")
    processCheckout(pay1, 500000.0)
    processCheckout(pay2, 5000000.0)
}