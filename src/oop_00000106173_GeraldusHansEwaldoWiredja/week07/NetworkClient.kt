package oop_00000106173_GeraldusHansEwaldoWiredja.week07

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "https://api.umn.ac.id" //shared constant

        fun createClient(): NetworkClient {
            println("membangun NetworkClient dengan BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }
    fun connect() {
        println("Connecting to $url...")
    }
}