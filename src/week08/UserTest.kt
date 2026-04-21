package week08

object DatabaseMock {
    fun finUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest() {
    println("\n===  Runnint Unit Test   ===")
    val testUser = DatabaseMock.finUser(1)

    // Di unit testing, jika user null, kita harap testnya gagal (crash)
    // Maka penggunaan !! sangat lazim di file testing
    val initial = testUser!!.name.substring(0, 1)

    //cehck() adalah fungsi bawaan kotlin untuk assertion
    check(initial == "T") {"Test Failed! Initial is wrong."}
    println("Test Passed; Initial is T")
}