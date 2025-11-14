package org.example.Lesson_3

fun main() {
    var lastMoveFrom = "E2"
    var lastMoveTo = "E4"
    var moveCounter = 1

    var lastMoveString = "$lastMoveFrom-$lastMoveTo;$moveCounter"
    println(lastMoveString)

    lastMoveFrom = "D2"
    lastMoveTo = "D3"
    moveCounter++

    lastMoveString = "$lastMoveFrom-$lastMoveTo;$moveCounter"
    println(lastMoveString)

}