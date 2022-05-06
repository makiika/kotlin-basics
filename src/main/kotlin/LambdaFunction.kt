fun main() {
    // this tutorial presents lambda functions in kotlin programming language

    val displayCountry = {
        country: String, region: String -> println("$country is in $region Africa")
    }

    displayCountry("Uganda", "East")
    displayCountry("Kenya", "East")
}