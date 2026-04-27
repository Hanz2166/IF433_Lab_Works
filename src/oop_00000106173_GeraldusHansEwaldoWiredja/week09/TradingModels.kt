package oop_00000106173_GeraldusHansEwaldoWiredja.week09

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)