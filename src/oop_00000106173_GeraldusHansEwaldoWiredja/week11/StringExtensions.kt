package oop_00000106173_GeraldusHansEwaldoWiredja.week11

//Extension function dengan receiver 'this'
fun String.addGreeting(): String {
    return "hello $this"
}

//Extension function dengan parameter
fun String.repeatTimes(n: Int): String {
    return.this.repeat(n)
}

fun String?.isNullOrEmpty(): Boolean {
    //'this' bisa bernilai null, jadi hatus ditangani
    return this == null || this.isEmpty()
}