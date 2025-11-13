package org.example.Lesson_2

fun main() {
    val studentsCount = 4
    val averageGrade: Float = (3 + 4 + 3 + 5).toFloat() / studentsCount

    println("%.2f".format(averageGrade))
}