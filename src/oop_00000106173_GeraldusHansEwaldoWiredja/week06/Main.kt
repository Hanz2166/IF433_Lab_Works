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

    val lamp = SmartLamp("1", "Ruang Tamu")
    val Speaker = SmartSpeaker("2", "Google Nest Dapur")
    val cctv = SmartCCTV("3", "Ezviz Garasi")
    val hub = SmartHome()

    hub.addDevice(lamp)
    hub.addDevice(Speaker)
    hub.addDevice(cctv)

    println("\n===TESTING SMARTHOMEHUB===")
    println("===SECURITY MODE===")
    hub.activateSecurityMode()

    println("\n===TURN OFF ALL DEVICES===")
    hub.turnOffAllSwitches()
}