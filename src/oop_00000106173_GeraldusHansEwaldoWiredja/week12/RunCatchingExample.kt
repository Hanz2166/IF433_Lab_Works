package oop_00000106173_GeraldusHansEwaldoWiredja.week12

fun main() {
    println("=== Test Run Catching ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    //patern: getorElse
    val safeValue = result.getOrElse {-1}
    println("Safe Value (getOrElse): $safeValue")

    //patern: recover (bisa mengubah tipe kegagalan jadi sukses)
    val recovered = result.recover {0}.getOrNull()
    println("Recovered Value: $recovered")

    runCatching {
        "100".toInt()
    }.onSuccess {v->
        println("Berhasil dikonversi; $v")
    }onFailure {e ->
        println("Gagal konversi: ${e.message}")
    }