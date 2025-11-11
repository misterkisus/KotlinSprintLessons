package org.example.Lesson_2

const val TIME_DIVIDER = 60

fun main() {
    val departureTimeHours = 9
    val departureTimeMinutes = 39
    val roadTime = 457

    val arrivalTimeTotal = departureTimeHours * TIME_DIVIDER + departureTimeMinutes + roadTime
    val arrivalTimeMinutes = arrivalTimeTotal % 60
    val arrivalTimeHours = arrivalTimeTotal / 60

    println("%02d:%02d".format(arrivalTimeHours, arrivalTimeMinutes))


}