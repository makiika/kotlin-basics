fun main() {

// storing enum values in an arrary
//    val cards = Card.values()
//    cards.forEach { println(it) }


// print enum constructor propery
//    println(Card.DIAMOND.color)
    val colors = Card.values()
    colors.forEach{println(it.color)}

}