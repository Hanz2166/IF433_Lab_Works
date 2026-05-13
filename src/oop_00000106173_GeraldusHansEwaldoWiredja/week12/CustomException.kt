package oop_00000106173_GeraldusHansEwaldoWiredja.week12

//custom exception membawa data tambahan
class InsufficientFundsException(
    val amount: Double,
    val balance: Double
): Exception("Attempted $amount, balance: $balance ")