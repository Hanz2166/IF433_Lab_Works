package oop_00000106173_GeraldusHansEwaldoWiredja.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> println("Awas! Muncul monster: ${event.monsterName}")
        is LootDropped -> {
            val (name, dmg, rarity) = event.item
            println("Hore! Mendapat loot: $name [$rarity] dengan damage $dmg")
        }
        is GameOver -> println("Permainan Berakhir: ${event.reason}")
        is SafeZone -> println("Anda berada di zona aman. Silakan beristirahat.")
    }
}