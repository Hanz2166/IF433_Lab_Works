package oop_00000106173_GeraldusHansEwaldoWiredja.weeok03

class Weapon (val name: String){
    var Damage: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: weapon is too weak.")
                return
            }else if (value > 1000){
                field = 1000
            }else {
                field = value
            }
        }

    val tier: String
        get() = when {
            Damage > 800 -> "Legendary"
            Damage > 600 -> "Epic"
            Damage < 600 -> "Common"
        }
}