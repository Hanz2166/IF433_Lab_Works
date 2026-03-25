package oop_00000106173_GeraldusHansEwaldoWiredja.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(60),
    UNCOMMON(30),
    RARE(20),
    EPIC(7),
    LEGENDARY(3)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)