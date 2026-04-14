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

    val event1: BattleState = BattleState.MonsterEncounter("Naga Api")
    val event2: BattleState = BattleState.LootDropped(
        GameItem("Pedang Emas", 50, ItemRarity.RARE)
    )
    val event3: BattleState = BattleState.GameOver("HP habis")
    val event4: BattleState = BattleState.SafeZone

    fun handleEvent(state: BattleState) {
        when (state) {
            is BattleState.MonsterEncounter -> {
                println("Bertemu monster: ${state.monsterName}")
            }is BattleState.LootDropped -> {
                println("Mendapat item: ${state.item.name}")
            }is BattleState.GameOver -> {
                println("Game Over: ${state.reason}")
            }
            BattleState.SafeZone -> {
                println("Kamu berada di zona aman")
            }
        }
    }

    handleEvent(event1)
    handleEvent(event2)
    handleEvent(event3)
    handleEvent(event4)

    val event5 = BattleState.MonsterEncounter("Goblin")
    val event6 = BattleState.LootDropped(
        GameItem("Pedang Api", 40, ItemRarity.RARE)
    )
    val event7 = BattleState.GameOver("Dikalahkan Boss")
    val event8 = BattleState.SafeZone

    processEvent(event5)
    processEvent(event6)
    processEvent(event7)
    processEvent(event8)
}