package week06

class SmartSpeaker (override val id: String,override val name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("$name speaker turned on")
    }
    override fun turnOff() {
        println("$name speaker turned off")
    }

    fun playMusic(Song: String) {
        println("$Song is currently playing")
    }
}