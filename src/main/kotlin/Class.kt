fun main() {
    println("classes in kotlin")

    val car1 = Car("subaru", 2020)
    val car2 = Car("Jeep", 2019)

    car1.display()
    car2.display()
}

class Car(var brand: String, var make: Int) {
    fun display() {
        println("This is $brand of $make")
    }
}