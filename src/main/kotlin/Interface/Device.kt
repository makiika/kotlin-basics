package Interface

class Device(
    override val brand: String,
    override val ram: String,
    val os: String

): Laptop {

    override val rom: String = "5gb"

}