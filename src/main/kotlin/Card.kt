

interface CardType {
    fun printCard()
}


enum class Card(val color:String): CardType {
    GOLD(color = "red"){
        override fun printCard() {
            TODO("Not yet implemented")
        }
                       },
    SLIVER(color = "green"){
        override fun printCard() {
            TODO("Not yet implemented")
        }
                           },
    DIAMOND(color = "purple"){
        override fun printCard() {
            TODO("Not yet implemented")
        }
    }
}