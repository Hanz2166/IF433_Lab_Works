package week06

class SmartLamp(override id: String, override name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("$name lamp turned on")
    }

    override fun turnOff() {
        println("$name lamp turned off")
    }
}