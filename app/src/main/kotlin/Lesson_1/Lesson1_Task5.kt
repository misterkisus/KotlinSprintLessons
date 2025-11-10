package org.example.Lesson_1

const val TIME_DIVIDER = 60

fun main() {
    var seconds = 6480
    val hours = seconds / TIME_DIVIDER / TIME_DIVIDER
    val minutes = seconds / TIME_DIVIDER % TIME_DIVIDER
    seconds = seconds % TIME_DIVIDER

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}