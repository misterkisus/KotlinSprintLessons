package org.example.Lesson_4

fun main() {
    val minAverageWeight = 35
    val maxAverageWeight = 100
    val maxAverageCapacity = 100

    var weight = 20
    var capacity = 80
    println("Груз с весом $weight кг и объемом $capacity л соответствует категории 'Average': ${((weight > minAverageWeight) && (weight <= maxAverageWeight)) && (capacity < maxAverageCapacity)}")

    weight = 50
    capacity = 100
    println("Груз с весом $weight кг и объемом $capacity л соответствует категории 'Average': ${((weight > minAverageWeight) && (weight <= maxAverageWeight)) && (capacity < maxAverageCapacity)}")

}