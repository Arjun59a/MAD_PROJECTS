fun main() {
    print("Enter your Number :")
    val num = readln().toInt()

    println(
        when (num) {
            1 -> "January" 2 -> "Feabruary" 3 -> "March" 4 -> "April" 5 -> "may" 6 -> "june" 7 -> "July" 8 -> "August" 9 -> "september" 10 -> "october" 11 -> "November" 12 -> "December" else -> "Please Enter proper Number"
        }
    )
}

