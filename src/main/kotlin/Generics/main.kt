package Generics

fun main() {
    val myphone = Myphone(phone = Andriod())
    val os = myphone.phone.printFonOs()
    println(os)
}