package oop_00000106173_GeraldusHansEwaldoWiredja.week09

fun main() {
    // Pipeline Inisialisasi Data Uji (Syarat data dipenuhi)
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 20, -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, 25.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 8.5, "OPEN"),
        TradeLog("ADAUSDT", "SHORT", 5, -2.0, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
}