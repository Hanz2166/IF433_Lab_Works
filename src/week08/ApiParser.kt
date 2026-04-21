package week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }
        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name"
        }
        val type = rawJson["type"] as? String
        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Product.Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Product.Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        val id: String
        when (product) {
            is Product.Electronic -> {
                val attr = if (product.warrantyMonths == 12) "Fallback Warranty ${product.warrantyMonths}" else "Warranty ${product.warrantyMonths}"
                println("${product.name} ($attr)")
                id = product.id
            }
            is Product.Clothing -> {
                println("${product.name} (Size ${product.size})")
                id = product.id
            }
        }
        val transactionID = JavaPaymentService.processPayment(id)!!
        println("Payment Success! Transaction ID: $transactionID")
    }
}