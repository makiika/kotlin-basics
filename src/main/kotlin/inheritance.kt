fun main() {
 val child1 = Child("makiika")

    child1.displayName()
}

open class Parent(var name: String ) {
    open fun displayName() {
        println(name)
    }
}

class Child( name: String ) : Parent(name) {

}