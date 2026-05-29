package oop_00000106173_GeraldusHansEwaldoWiredja.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }
    if (isJammed) {
        throw DispenserJamException()
    }
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== Simulasi Jadwal Makan Pagi ===")
    try {
        currentKibbleStock = dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
        println("Pagi: Kibble terdispensi berhasil. Sisa stok: $currentKibbleStock gr")
    } catch (e: DispenserJamException) {
        println("Error Pagi: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Error Pagi: ${e.message}")
    } catch (e: Exception) {
        println("Error Pagi (General): ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("\n=== Simulasi Jadwal Makan Sore ===")
    currentKibbleStock = 1000
    runCatching {
        dispenseKibble(requestedGram = 30, availableGram = currentKibbleStock, isJammed = false)
    }
}