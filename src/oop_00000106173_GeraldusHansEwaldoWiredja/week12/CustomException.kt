package oop_00000106173_GeraldusHansEwaldoWiredja.week12

//custom exception membawa data tambahan
class InsufficientFundsException(
    val amount: Double,
    val balance: Double
): Exception("Attempted $amount, balance: $balance ")

class BankAccount(var balance: Double) {
    fun withdraw(amount: Double): Double {
        if(amount < 0){
            throw IllegalArgumentException("Amount must be greater than 0")
        }if(amount>balance) {
            throw InsufficientFundsException(amount, balance)
        }
        balance -= amount
        println("Withdraw Success. Remaining balance: $balance")
    }
}