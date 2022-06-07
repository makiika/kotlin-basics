package `Map and FlatMap`

fun main() {
    val flagColors= listOf(
        Colors(listOf("black","red","yellow")),
        Colors(listOf("green","blue","orange")),
        Colors(listOf("purple","black","white")))

    val students = listOf(People(
        listOf( Person("mukisa", 45,"tanzania"),
            Person("namkiika", 23,"uganda"),
            Person("makiika", 15,"kenya"))
       ))


    println("using map")
    println(students.map { it.person })

    println("using flatmap")
    println(students.flatMap {  it.person})
//    println("using map")
//    println(flagColors.map { it.items })
//    println(People.map { it })
//
//    println("using flatmap")
//    println(flagColors.flatMap { it.items })
//    println(People.flatMap { it })
}