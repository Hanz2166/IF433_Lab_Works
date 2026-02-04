package oop_00000106173_GeraldusHansEwaldoWiredja.week01

fun main() {
    val Halo = "Halo" to 250000
    val RDR2 = "RDR2" to 550000

    val HaloDiscountPrice = calculateDiscount(Halo.second)
    val RDR2DiscountPrice = calculateDiscount(RDR2.second)
}

fun calculateDiscount(price: Int): Int {
    return if(price > 500000) {
        price - (price * 10/100)
    } else {
        price
    }
}