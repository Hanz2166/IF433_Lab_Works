package oop_00000106173_GeraldusHansEwaldoWiredja.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game has already been started!")
        }else {
            isGameRunning = true
            println("Game is starting...")
        }
    }
}