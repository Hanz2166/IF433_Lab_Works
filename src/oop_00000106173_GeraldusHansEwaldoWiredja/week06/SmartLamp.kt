package week06

class SmartLamp(override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("$name lamp turned on")
    }

    override fun turnOff() {
        println("$name lamp turned off")
    }
}