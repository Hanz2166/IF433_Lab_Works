package oop_00000106173_GeraldusHansEwaldoWiredja.week10

class WalletRepository<T> {
    private val items = mutableMapOf<T>()
    fun add (item: T){
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun search(predicate: (T) -> Any): List<T> {
        return items.filter { predicate(it) as? Boolean ?: false }
    }
}