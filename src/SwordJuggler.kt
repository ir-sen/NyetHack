
import java.lang.Exception
import kotlin.IllegalStateException

fun main(args: Array<String>) {
    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if(isJugglingProficient) {
        swordsJuggling = 2
    }

    try {
        proficiencyCheck(swordsJuggling)

        swordsJuggling = swordsJuggling!!.plus(1)
    }catch (e: Exception){
        println(e)
    }

    println("You juggle $swordsJuggling swords")



}

//Функция исключения
fun proficiencyCheck(swordsJuggling: Int?){
    //swordsJuggling ?: throw IllegalStateException("Player cannot juggle swords")
//    swordsJuggling ?: throw UninitializedPropertyAccessException()
    checkNotNull(swordsJuggling, {"Playo er cannot juggle swords"})
}

class UnskilledSwordJugglerException():
        IllegalStateException("Player cannot juggle swords")

