package oop_00000106173_GeraldusHansEwaldoWiredja.week01

fun main() {
    val radius = 7.0
    val pi = 3.14

    val area: Double = radius * pi * radius

    println("Radius: $radius, Area: $area")
    println(checkSize(area))
}

fun checkSize(area: Double): String =
    if (area > 100) "It's quite big, Impressive"
    else "SO TINY!!"