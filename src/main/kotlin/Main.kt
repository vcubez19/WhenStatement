fun main() {

    val userNumber = readLine()!!.toInt()
    var number: String = ""

    number = when (userNumber) {
        !in 1..10 -> "Out of range"
        1 -> "uno"
        2 -> "dos"
        3 -> "tres"
        4 -> "cuatro"
        5 -> "cinco"
        6 -> "seis"
        7 -> "siete"
        8 -> "ocho"
        9 -> "nueve"
        10 -> "diez"
        else -> "Unknown"
    }

    println("The Spanish equivalent of $userNumber is $number")

}
