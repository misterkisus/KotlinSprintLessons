package org.example.Lesson_2

fun main() {
    val crystalOreMined = 7
    val ironOreMined = 11
    val buffMultiplier = 0.2f

    val crystalOreBuffed = (crystalOreMined * buffMultiplier).toInt()
    val ironOreBuffed = (ironOreMined * buffMultiplier).toInt()

    println("""
        Кристаллическая руда: $crystalOreBuffed
        Металлическая руда: $ironOreBuffed
    """.trimIndent())
}