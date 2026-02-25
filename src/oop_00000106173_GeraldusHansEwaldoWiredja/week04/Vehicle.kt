package oop_00000106173_GeraldusHansEwaldoWiredja.week04

//gunakan keyword 'open' biar class bisa diwariskan
open class Vehicle(val brand: String){
    var speed: Int = 0

    //Method juga bersifat final secara default. gunakan 'open' agar bisa di override
    open fun accelerate(){
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk(){
        println("vroom vroom!")
    }
}