import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.sql.Time

class Poezd_nasl:Poezdka() {
    override var num:Int=0
    override var punkt_naznacheniya:String=""
    override var day_vputi:Int=0
    override var time_prib: String=""
    override var time_stoyanka: String=""

    fun buy_bilet(){
        var bilet:Int
        println("Купить билет:")
        println("1.Купе-2000")
        println("2.Плацкарт-1000")
        val otv= readLine()!!.toInt()

        when(otv){
            1->{
                println("Билет в купе купен")
            }
            2->{
                println("Билет в плацкарт купен")
            }
        }
    }

    suspend fun main()= coroutineScope {
        launch {
            println("Введите сколько раз будет выпонятся код")
            var n= readLine()!!.toInt()
            if (n<0){
                println("Ошибка! Не коректный ввод")
            }
            else {
                for (i in 1..n) {
                    delay(200)
                }
            }
        }
    }
}