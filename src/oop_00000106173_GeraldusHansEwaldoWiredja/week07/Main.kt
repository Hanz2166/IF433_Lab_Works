package oop_00000106173_GeraldusHansEwaldoWiredja.week07

fun main() {
    println("=== Test Singleton ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Roland", 33)
    val reg2 = RegularUser("Roland", 33)
    println(reg1) // Akan mencetak memori hash
    println("Sama? ${reg1 == reg2}") // False

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Angelica", 35)
    val data2 = DataUser("Angelica", 35)
    println(data1) // Otomatis readable format
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 36)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1 // Destructing Declaration
    println("Destructed: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    // ERROR: 'when' expression must be exhaustive
    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        is ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println("\n=== SIMULASI TUGAS MANDIRI RPG ===")

    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance Legendary: ${ItemRarity.LEGENDARY.dropChance}%")
    val myWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${myWeapon.item.name}, Durability: ${myWeapon.durability}")
}