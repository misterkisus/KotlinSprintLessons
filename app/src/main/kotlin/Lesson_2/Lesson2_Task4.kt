package org.example.Lesson_2

fun main() {
    val crystalOreMined = 7
    val ironOreMined = 11
    val buffMultiplier = 20

    val crystalOreBuffed = crystalOreMined * buffMultiplier / 100
    val ironOreBuffed = ironOreMined * buffMultiplier / 100

    println("""
        Кристаллическая руда: $crystalOreBuffed
        Металлическая руда: $ironOreBuffed
    """.trimIndent())
}