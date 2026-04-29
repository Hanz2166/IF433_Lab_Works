package week08

class BattleState {
    fun sendEmail(emailAddress: String) {
        println("Sending email to $emailAddress")
    }
    fun processUser(User: UserProfile){
        //send email(user.email) // INI AKAN ERROR: Type Mismatch
        if (User.email != null){
            //Success via smart cast: compiler tahu 'User.email'pasti tidak null di blok ini
            sendEmail(User.email!!)
        }else{
            println("User ${User.name} does not have an account yet")
        }
    }
}