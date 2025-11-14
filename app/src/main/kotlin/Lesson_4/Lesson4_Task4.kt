package org.example.Lesson_4

fun main() {
    val currentDay = 5

    println("""
        Упражнения для рук: ${currentDay % 2 == 1}
        Упражнения для ног: ${currentDay % 2 == 0}
        Упражнения для спины: ${currentDay % 2 == 0}
        Упражнения для пресса: ${currentDay % 2 == 1}
    """.trimIndent())
}