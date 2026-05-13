package oop_00000106173_GeraldusHansEwaldoWiredja.week12

fun main() {
    println("=== Test Run Catching ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}