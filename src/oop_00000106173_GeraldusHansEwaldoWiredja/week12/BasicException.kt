package oop_00000106173_GeraldusHansEwaldoWiredja.week12

fun divide(a: Int, b: Int): Int {
    try{
        return a / b
    }catch(e:Exception){
        println("Error: ${e.message}")
        return -1
    }finally{
        println("Division operation completed.")
    }
}

fun main(){
    println("=== Test Try As Expression ===")
    val inputString = "123A"

    //try langsung mengembalikan hasil parsing, atau -1 jika gagal
    val result: Int = try {
        Integer.parseInt(inputString)
    }catch (e: NumberFormatException){
        -1
    }

    println("Result of parsing: $result")
}