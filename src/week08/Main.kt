package week08

fun main() {
    println("===    Test  Safe Calls & Elvis    ===")
    val emptyOrder = Orders(null, null)

    //rantai safe calls yang elegean
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?:
    "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}