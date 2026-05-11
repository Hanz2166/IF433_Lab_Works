package oop_00000106173_GeraldusHansEwaldoWiredja.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    println("=== Konfigurasi Smart Lighting ===")
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also { device ->
        homeDevices.add(device)
        println("✓ Lampu ditambahkan: ${device.diagnose()}")
    }

    println("\n=== Konfigurasi Smart Security ===")
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also { device ->
        println("(LOG) Kamera terhubung")
        homeDevices.add(device)
        println("✓ Kamera ditambahkan: ${device.diagnose()}")
    }
}

