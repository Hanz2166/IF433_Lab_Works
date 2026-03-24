package week06

class SmartCCTV (override id: String, override name: String): SmartDevice, Switchable, Record{
    override fun turnOn() {
        println("CCTV $name activated")
        startRecord()
    }
    override fun turnOff() {
        println("CCTV $name deactivated")
        stopRecord()
    }

    override fun stopRecord() {
        println("CCTV $name stopped recording")
    }
    override fun startRecord() {
        println("CCTV $name started recording")
    }
}