package week08

//nama adalah non-null(wajib), email dna phone adalah nullable(opsional)
class UserProfile (
    val name: String,
    val email: String?,
    val phone: String? = null //default argument null
)