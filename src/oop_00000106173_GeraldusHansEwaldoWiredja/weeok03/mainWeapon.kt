package oop_00000106173_GeraldusHansEwaldoWiredja.weeok03

fun main(){
    val weapon = Weapon("Inverted Spear of Heaven")

    weapon.Damage = -999
    println("Weapon damage = ${weapon.Damage}")

    weapon.Damage = 999
    println("Weapon damage = ${weapon.Damage}")

    println("Weapon tier ${weapon.tier}")
}