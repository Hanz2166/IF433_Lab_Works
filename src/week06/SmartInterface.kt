package week06

interface SmartDevice {
    val id: String
    val name: String
}
interface Switchable {
    fun turnOn()
    fun turnOff()
}
interface Record {
    fun startRecord()
    fun stopRecord(){
        println("Stop record, save to cloud")
    }
}