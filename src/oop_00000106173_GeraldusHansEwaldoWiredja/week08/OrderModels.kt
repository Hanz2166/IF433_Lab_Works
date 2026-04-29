package week08

class City(val name: String) {}
class Address(val city: String) {}
class DeliveryDetails(val address: Address?)
class Orders(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?) {}