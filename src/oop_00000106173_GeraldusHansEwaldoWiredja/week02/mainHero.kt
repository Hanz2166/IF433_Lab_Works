package oop_00000106173_GeraldusHansEwaldoWiredja.week02

import java.until.scanner
import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("Welcome O Chosen One")
    println("What is your name?\n")
    val heroName = scanner.nextLine()

    println("base Damage Hero: ")
    val heroDamage  = scanner.nextLine()

    val hero = Hero(heroName, heroDamage)

    var enemyhp = 100

    println("\nAdvanture Start! \nEnemyhp: $enemyhp\n")

    while(Hero.isAlive && enemyhp > 0){
        println("What will you do hero?")
        println("1. Attack")
        println("2. Nigerundayo!!!")
        val choice = scanner.nextLine()

        when(choice){
            1-> {
                hero.attack("Enemy")

                enemyhp -= heroDamage
                if (enemyhp > 0){
                    val enemyDamage = (10..20).random()
                    println("Enemy Memberontak!")
                    hero.takeDamage(enemyDamage)
                }
            }
            2-> {
                println("$heroName berhasil kabur (skill Issue)")
                break
            }
            else -> {
                println("pilihan gak ada, baca ulang!")
            }
        }
        println()
    }
    println("Match Results")

    if(Hero.isAlive() && enemyhp = 0){
        println("Mission Success")
    }else if(!Hero.isAlive() && enemyhp > 0){
        println("Mission Fail(we'll get them next time)")
    }else {
        println("Draw! Finally a worthy opponent, our battle shall be legendary!")
    }
}