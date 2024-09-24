fun minutesToSeconds(timeString: String): Int {
    val (minutes, seconds) = timeString.split(":").map(String::toInt)
    return if (seconds !in 0..59) {
        -1
    } else {
        (minutes * 60) + seconds
    }
}

fun main() {
    println(minutesToSeconds("01:00"))
    println(minutesToSeconds("13:56"))
    println(minutesToSeconds("10:60"))
    println(minutesToSeconds("121:49"))
    println(minutesToSeconds("05:59"))
}