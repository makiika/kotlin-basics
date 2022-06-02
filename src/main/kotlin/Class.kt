fun main() {
    println("classes in kotlin")

    val car1 = Car("subaru", 2020)
    val car2 = Car("Jeep", 2019)

    car1.display()
    car2.display()
}

class Car(val brand: String, val make: Int) {
    var numberPlate: String? = null

    fun displayPlate(){
        val newNumberPlate: String = numberPlate ?: "no value"
        println(newNumberPlate)
    }
    fun display() {
        println("This is $brand of $make")
    }
}