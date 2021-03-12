package TeDemo

const val omSymbol = '\u0950'
const val unC1 = '\u03E2'
fun doYouSEMF(str: String) =

    str.replace(Regex("[iskb]")){
        when(it.value){
            "i" -> "s"
            "s" -> "Suck"
            "k" -> "$unC1"
            "b" -> "$omSymbol"
            else -> it.value
        }
    }





fun main(args: Array<String>) {
    val testW = "iskb"
    val pr = doYouSEMF(testW)
    println(doYouSEMF("Do is kb"))
}