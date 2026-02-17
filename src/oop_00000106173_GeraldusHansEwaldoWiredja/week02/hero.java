package oop_00000106173_GeraldusHansEwaldoWiredja.week02;

class hero (
    val name: String,
    var hp: Int = 100,
    var baseDamage: Int
){
    fun attack(targetName: String){
        println("$name meneyrang $targetName")
    }

    fun takeDamage(damage: Int){
        hp -= damage

        if (hp<o){
            hp = 0
        }
        println("$name menerima $damage damage, hp = $hp")
    }

    fun isAlive(): Boolean{
        return hp >
    }
}