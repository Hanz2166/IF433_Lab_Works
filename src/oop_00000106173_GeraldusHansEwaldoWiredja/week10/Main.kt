package oop_00000106173_GeraldusHansEwaldoWiredja.week10

fun main() {
    println("===    Test Generic Class  ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n===  Test Multiple Parameters  ===")
    val itemPrice = PairBox("BitCoin", 65000)

    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = processData("Stable Coin")
    println("Hasil proses: $result")
}