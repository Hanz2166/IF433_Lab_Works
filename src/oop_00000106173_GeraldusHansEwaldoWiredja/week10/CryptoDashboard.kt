package oop_00000106173_GeraldusHansEwaldoWiredja.week10

val coinRepo = WalletRepository<Coin>()
coinRepo.add(Coin("BTC", 0.5))
coinRepo.add(Coin("ETH", 10.2))
coinRepo.add(Coin("USDT", 500.0))
val response = ApiResponse("200 OK", coinRepo.getAll())

println("Status: ${response.status}")
response.data.forEach {
    println("Coin: ${it.name}, Balance: ${it.balance}")
}

val txRepo = WalletRepository<Transaction>()
txRepo.add(Transaction("TX001", 0.1))
txRepo.add(Transaction("TX002", 2.5))

println("\n=== Transaction History ===")
txRepo.getAll().forEach { println("ID: ${it.id}, Amount: ${it.amount}") }