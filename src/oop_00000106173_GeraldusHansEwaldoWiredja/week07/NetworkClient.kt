package oop_00000106173_GeraldusHansEwaldoWiredja.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}