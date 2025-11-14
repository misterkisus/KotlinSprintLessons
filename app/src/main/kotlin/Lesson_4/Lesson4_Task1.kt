package org.example.Lesson_4

fun main() {
    val totalTables = 13
    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9

    println("Доступность столиков на сегодня: ${!(totalTables == bookedTablesToday)}\n" +
            "Доступность столиков на завтра: ${!(totalTables == bookedTablesTomorrow)}")
}