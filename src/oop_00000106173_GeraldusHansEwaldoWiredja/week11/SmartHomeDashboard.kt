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

    println("\n=== Konfigurasi Smart HVAC ===")
    run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }.also { device ->
        homeDevices.add(device)
        println("✓ AC ditambahkan: ${device.diagnose()}")
    }

    println("\n=== Konfigurasi Pet Care ===")
    SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10).also { device ->
        homeDevices.add(device)
        println("✓ Alat pakan ditambahkan: ${device.diagnose()}")
    }

    println("\n=== Pencarian Perangkat ===")
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let { device ->
        println("Ditemukan: ${device.diagnose()}")
    }

    println("\n=== Rangkuman Sistem ===")
    with(homeDevices) {
        println("Total perangkat terdaftar: ${this.size}")
        this.forEach { device ->
            println("  - ${device.name} (${device.category})")
        }
    }

    println("\n=== Total Daya Sistem ===")
    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total daya yang digunakan: $totalPower Watt")
}

