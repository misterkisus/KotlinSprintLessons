package org.example.Lesson_1

const val TIME_DIVIDER = 60

fun main() {
    var seconds = "6480"
    val hours = String.format("%02d", seconds.toInt() / TIME_DIVIDER / TIME_DIVIDER)
    val minutes = String.format("%02d", seconds.toInt() / TIME_DIVIDER % TIME_DIVIDER)
    seconds = String.format("%02d", seconds.toInt() % TIME_DIVIDER)

    println("$hours:$minutes:$seconds")
}