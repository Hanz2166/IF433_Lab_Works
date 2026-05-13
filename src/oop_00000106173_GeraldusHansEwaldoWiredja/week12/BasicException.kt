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