package oop_00000106173_GeraldusHansEwaldoWiredja.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Sebuah Monster Muncul!: ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Kamu Menemukan: $name (Rarity: $rarity, Damage: $damage)")
        }
        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Kamu berada di zona aman. Istirahat sejenak.")
        }
    }
}