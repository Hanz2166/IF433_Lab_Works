package week08

fun main() {
    println("===    Test  Safe Calls & Elvis    ===")
    val emptyOrder = Orders(null, null)

    //rantai safe calls yang elegean
    val destination = emptyOrder.deliveryDetails?.address?.city ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n===  Test Let Block  ===")
    val validOrder = Orders(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        // Blok ini HANYA jalan jika total price tidak null
        val tax = price * 0.11
        "Transakksi valid. Harga = Rp$price, Pajak = Rp$tax"
    }?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)

    println("\n===  Test Safe Casting   ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text  = item as? String
         //hanay cetak jika cast sukses
        text?.let { println("Ditemukan teks: ${it.uppercase()}") }
    }

    val someObject: Any = 100 //Tiper asli interger
    //coba cast ke string. Jika gagal(null), ganti dengan "unknown String"
    val safeString = someObject as? String?: "Unknown String"
    println("Hasil cast + fallback: $safeString")

    println("\n===  Test Tombol Merah (!!)  ===")
    val toxicData: String? = null
    try {
        //Dangerous: memaksa Compiler percaya data ini tidak null
        val lenght = toxicData!!.length
    }catch (e: NullPointerException){
        println("Crash (NPE)! Jangan gunakan !! secara sembarangan.")
    }

    val apiResponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try {
        //ALih-alih apiResponse
        val token = requireNotNull(apiResponse["token"]){
            "Critical Exception: Token is missing in API response!"
        }
    }catch (e: IllegalArgumentException){
        println("Error: ${e.message}")
    }

    println("\n===  Test Java Interrop  ===")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()
    //Kita menekan tombol !! karena kita tahu implementasi java-nya aman
    val statusLength = javaResponse!!.length
    println("Status dari java: $javaResponse (Length: $statusLength)")
}