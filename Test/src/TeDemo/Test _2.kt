package TeDemo



const val BIL = "SEcond vill see you name "

fun main(args: Array<String>) {
    val omSymbol = '\u0950'
    println(omSymbol)

    println(toDragonSpeak("SEcond vill see you nam"))
}


private fun toDragonSpeak(phrase: String) =

    phrase.replace(Regex("[ariou]")) {
        when (it.value) {
            "a" -> "4"
            "b" -> "3"
            "i" -> "1"
            "0" -> "0"
            "u" -> "|_|"
            else -> it.value
        }
    }

