fun main() {
    agoToText(50)
    agoToText(100)
    agoToText(150)
    agoToText(600)
    agoToText(660)
    agoToText(39600)
    agoToText(70_000)
    agoToText(76_000)
    agoToText(80_000)
    agoToText(129_000)
    agoToText(216_000)
    agoToText(260_000)

}


val oneMinute = 60
val oneHour = 60 * 60
val oneDay = 24 * 60 * 60
val twoDay = 24 * 60 * 60 * 2
val threeDay = 24 * 60 * 60 * 3
val minute = ""


fun agoToText(second: Int) {
    val howMinute = second / oneMinute
    val howHour = second / oneHour

    when {
        second <= oneMinute -> println("был(а) только что")
        second >= 61 && second <= oneHour -> println("был(а) " + howMinute + minuteDeclination(howMinute) + " назад")
        second >= oneHour + 1 && second <= oneDay -> println("был(а) " + howHour + clockDeclination(howHour) + " назад")
        second >= oneDay + 1 && second <= twoDay -> println("был(а) сегодня")
        second >= twoDay + 1 && second <= threeDay -> println("был(а) вчера")
        second >= threeDay + 1 -> println("был(а) давно")
    }

}

fun clockDeclination(time: Int): String {
    val howHourStr = time.toString()
    val howHourCharrArr = howHourStr.toCharArray()
    val clockDeclination1 = " час"
    val clockDeclination2 = " часа"
    val clockDeclination3 = " часов"
    if (howHourCharrArr.size > 1) {
        if (howHourCharrArr[howHourCharrArr.size - 2] == '1') {
            return clockDeclination3
        }
    }
    when {
        howHourCharrArr.last() == '2' || howHourCharrArr.last() == '3' || howHourCharrArr.last() == '4' -> return clockDeclination2
        howHourCharrArr.last() == '1' -> return clockDeclination1
        else -> return clockDeclination3
    }
}

fun minuteDeclination(time: Int): String {
    val howMinuteStr = time.toString()
    val howMinuteCharrArr = howMinuteStr.toCharArray()
    val minuteDeclination1 = " минуту"
    val minuteDeclination2 = " минуты"
    val minuteDeclination3 = " минут"
    if (howMinuteCharrArr.size > 1) {
        if (howMinuteCharrArr[howMinuteCharrArr.size - 2] == '1') {
            return minuteDeclination3
        }
    }


    when {
        howMinuteCharrArr.last() == '2' || howMinuteCharrArr.last() == '3' || howMinuteCharrArr.last() == '4' -> return minuteDeclination2
        howMinuteCharrArr.last() == '1' -> return minuteDeclination1
        else -> return minuteDeclination3
    }

}




