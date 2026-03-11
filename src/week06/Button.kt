package week06

class Button(override val name: String): Clickable {
    override fun click() {
        println("tombol '$name' berhasil di klik!")
    }
}