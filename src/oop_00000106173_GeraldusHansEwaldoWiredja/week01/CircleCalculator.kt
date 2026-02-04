package oop_00000106173_GeraldusHansEwaldoWiredja.week01

fun main(args: Array<String>) {
    //variable Definition
    val radius= 7.0
    val pi= 3.14

    //Calculation
    var area: Double = radius * pi * radius

    //Output Concatenation
    println("Radius: $radius, Area: $area")

    //Logic Check
    CheckSize(area)
}

fun CheckSize(area: Double) {
    if (area > 100) {
        println("It's quite big, Impressive")
    } else {
        println("SO TINY!!")
    }
}