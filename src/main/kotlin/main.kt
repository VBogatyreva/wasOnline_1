fun main() {

    val timeWasOnline = agoToText(900)
    println(timeWasOnline)
}

fun agoToText(seconds: Long) {
    var timeAgo = when (seconds) {
        in 0..60 -> println("был(а) только что")
        in 61..(60 * 60) -> {
            val minutes = (seconds / 60).toInt()
            val minutesEnd = if ((minutes % 10 == 1 || minutes == 1) && minutes != 11) "минуту"
            else if ((minutes % 10 == 2 || minutes == 2) && minutes != 12) "минуты"
            else if ((minutes % 10 == 3 || minutes == 3) && minutes != 13) "минуты"
            else if ((minutes % 10 == 4 || minutes == 4) && minutes != 14) "минуты"
            else if (minutes == 11 || minutes == 12 || minutes == 13) "минут"
            else "минут"
            println("был(а) $minutes $minutesEnd назад")
        }

        in 60 * 60 + 1..24 * 60 * 60 -> {
            val hours = (seconds / 3600).toInt()
            val hoursEnd = if (hours == 1 || hours == 21) "час"
            else if (hours == 2 || hours == 3 || hours == 4 || hours == 22 || hours == 23 || hours == 24) "часа"
            else "часов"
            println("был(а) $hours $hoursEnd назад")
        }

        in 24 * 60 * 60 + 1..2 * 24 * 60 * 60 -> println("был(а) вчера")
        in 2 * 24 * 60 * 60 + 1..3 * 24 * 60 * 60 + 1 -> println("был(а) позавчера")
        else -> println("был(а) давно")
    }
    return timeAgo
}


