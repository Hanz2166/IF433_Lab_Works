package oop_00000106173_GeraldusHansEwaldoWiredja.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val Sword = GameItem(
            "Pedang Kayu Bapuk",
            5,
            ItemRarity.COMMON
        )
        return Weapon(Sword, 50)
    }

    fun forgeEpicSword(): Weapon {
        val Sword = GameItem(
            "Excalibur",
            100,
            ItemRarity.EPIC,
        )
        return Weapon(Sword, 200)
    }
}
}