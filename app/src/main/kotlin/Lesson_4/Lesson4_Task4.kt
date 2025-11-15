package org.example.Lesson_4

fun main() {
    val currentDay = 5
    val isCurrentDayEven = currentDay % 2 == 0

    println("""
        Упражнения для рук: ${!isCurrentDayEven}
        Упражнения для ног: ${isCurrentDayEven}
        Упражнения для спины: ${isCurrentDayEven}
        Упражнения для пресса: ${!isCurrentDayEven}
    """.trimIndent())
}