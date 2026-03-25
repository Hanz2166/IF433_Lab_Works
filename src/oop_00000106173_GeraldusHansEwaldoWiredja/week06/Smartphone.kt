package week06

//ERROR: Class Smartphone inherits multiple implementations of turnOn()
class Smartphone : Camera, Phone {
    //Manually override to resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn()  //Menjalankan Logika Camera
        super<Phone>.turnOn()   //Menjalankan Logika Phone
        println("Sistem operasi Smartphone berhasil booting")
    }
}