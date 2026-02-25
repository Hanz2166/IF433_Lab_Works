package oop_00000106173_GeraldusHansEwaldoWiredja.week03

class Player (val userName: String) {
    private var EXP: Int = 0

    val level: Int
        get() = (EXP / 100) + 2

    fun recieveEXP (amount: Int) {
        if (amount <= 0) {
            println("EXP haru positif")
            return
        }
        val oldLevel = level

        EXP += amount
        val newLevel = level

        if(newLevel > oldLevel) {
            println("Level Up! Selamat ${userName} naik ke level ${newLevel}")
        }
    }
}