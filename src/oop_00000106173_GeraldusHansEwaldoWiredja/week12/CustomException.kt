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
        }
        if(amount > balance) {
            throw InsufficientFundsException(amount, balance)
        }
        balance -= amount
        println("Withdraw Success. Remaining balance: $balance")
        return balance
    }
}

fun main() {
    println("=== Test Multiple Catch ===")
    val account = BankAccount(100.0)

    try{
        account.withdraw(1500.0)// <- Trigger InssuficientException
    }catch(e: InsufficientFundsException){
        println("Caught Domain Error: Uang tidak cukup.   ${e.message}")
    }catch(e: IllegalStateException){
        println("Caught Domain Error: Input tidak valid.   ${e.message}")
    }catch(e: Exception){
        println("Caught General Error: Terjadi kesalahan tidak terduga.   ${e.message}")
    }
}