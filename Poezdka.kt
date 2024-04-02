import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.sql.Time

abstract class Poezdka:Inter {
    abstract var num:Int
    abstract var punkt_naznacheniya:String
    abstract var day_vputi:Int
    abstract var time_prib:String
    abstract var time_stoyanka:String

    override fun time_bilet(){
        println("Введите врямя билета")
        var timee= readLine()!!.toString()
    }




}