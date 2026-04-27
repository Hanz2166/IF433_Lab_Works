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
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
    val worstPerformersString = losingTrades
        .sortedBy { it.roe } // Diurutkan dari yang minusnya paling besar
        .map { "LOSS [${it.pair} ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()
}