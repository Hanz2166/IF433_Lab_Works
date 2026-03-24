package week06

class SmartHome {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {devices.add(device)}

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {device.turnOff() }
        }
    }

    fun activateSecurityMode() {
        for (device in devices) {
            if (device is Record){device.startRecord()}
            if (device is SmartSpeaker){device.playMusic("Wedding Bells")}
        }
    }
}