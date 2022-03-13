const val likes = 558

fun main() {
    val peopleNotation =
        if (likes == 1 || likes % 10 == 1 && likes % 100 != 11) {
            "человеку"
        } else if (likes % 1_000 == 0) {
            "людей"
        } else "людям"

    println("Понравилось $likes $peopleNotation")
}