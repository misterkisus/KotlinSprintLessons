package org.example.Lesson_1

fun main() {
    var seconds = 6480
    var hours = 0
    var minutes = 0

    hours = seconds / 60 / 60
    minutes = seconds / 60 % 60
    seconds = seconds % 60

    println("0$hours:$minutes:0$seconds")
}