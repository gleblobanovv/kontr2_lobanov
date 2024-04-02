import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

suspend fun main(){
    var poezdkaa=Poezd_nasl()
    poezdkaa.num=1
    poezdkaa.punkt_naznacheniya="Екатеринбург"
    poezdkaa.day_vputi=5
    poezdkaa.time_prib="10:15"
    poezdkaa.time_stoyanka="2 часа"

    println("Выберите действие:")
    println("1.Информация о поездке")
    println("2.Внести изменения")
    println("3.Купить билет")
    println("4.Время билета")

    val otv= readLine()!!.toInt()

    coroutineScope {
        launch {
            println("Введите сколько раз будет выполняться код")
            var n = readLine()!!.toInt()
            repeat(n) {
                delay(200)

                when (otv) {
                    1->{
                        println("Информация:")
                        println("Номер поезда:"+poezdkaa.num)
                        println("Пункт назначения:"+poezdkaa.punkt_naznacheniya)
                        println("Дни в пути:"+poezdkaa.day_vputi)
                        println("Время прибытия:"+poezdkaa.time_prib)
                        println("Время стоянки поезда:"+poezdkaa.time_stoyanka)
                        println()
                    }
                    2->{
                        println("Введите номер поезда:")
                        poezdkaa.num= readLine()!!.toInt()
                        if (poezdkaa.num<0){
                            println("Не коректные данные!")
                        }

                        println("Введите пункт назначения:")
                        poezdkaa.punkt_naznacheniya= readLine()!!.toString()

                        println("Введите дни в пути:")
                        poezdkaa.day_vputi= readLine()!!.toInt()
                        if (poezdkaa.day_vputi<=0){
                            println("Не коректные данные!")
                        }

                        println("Введите время прибытия (hour:minutes):")
                        poezdkaa.time_prib= readLine()!!.toString()

                        println("Введите время стоянки поезда(... hour/minutes):")
                        poezdkaa.time_stoyanka= readLine()!!.toString()

                        println()
                    }
                    3->{
                        poezdkaa.buy_bilet()
                    }
                    4->{
                        poezdkaa.time_bilet()
                    }
                }
            }
        }
    }
}