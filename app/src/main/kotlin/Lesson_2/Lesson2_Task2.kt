package org.example.Lesson_2

fun main() {
    val employees = 50
    val employeeSalary = 30000

    val interns = 30
    val internSalary = 20000

    val salaryExpenses = employees * employeeSalary
    val totalSalaryExpenses = salaryExpenses + interns * internSalary
    val averageSalary = totalSalaryExpenses / (employees + interns)

    println("""
        Расходы на зарплаты сотрудников: $salaryExpenses
        Общие расходы на зарплаты: $totalSalaryExpenses
        Средняя зарплата: $averageSalary
    """.trimIndent())

}