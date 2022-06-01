
interface Person {

    fun displayPersonInfo()

    fun displayPersonName()

}

class Parent1(val name: String, val nationality: String) : Person{

    override fun displayPersonInfo() {
        println("Mr $name is a $nationality")
    }

    override fun displayPersonName() {
        println("The created person's name is $name")
    }
}

fun main() {

    val parent1 = Parent1(name="makiika", nationality = "Ugandan")
    parent1.displayPersonInfo()
}