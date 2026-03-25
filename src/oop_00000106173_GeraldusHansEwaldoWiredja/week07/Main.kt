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
}