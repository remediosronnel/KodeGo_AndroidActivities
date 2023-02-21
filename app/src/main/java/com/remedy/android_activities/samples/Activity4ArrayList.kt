package com.remedy.android_activities.samples


fun main() {
    var itemIteration = true
    var employeesName = mutableListOf<String>()
    var employeesSalary = mutableListOf<Double>()
    var employeePeriods = mutableListOf<Int>()
    while (itemIteration){

        plusFunction(employeesName, employeesSalary, employeePeriods)

    employeesName.forEachIndexed { index, name ->
        println(
            "${index + 1}. Name: $name - Salary Rate: ${employeesSalary[index]} - Pay Period: ${employeePeriods[index]} " +
                    "Total Pay: ${employeesSalary[index] * employeePeriods[index]}"

        )

    }

    println("Do you want to continue? Y/N")
        when(readln()){
            "Y" -> {
                itemIteration = true
            }
            "N" ->{
                return
                itemIteration = false
            }
            else ->{
                println("Invalid")
                itemIteration = true
            }
        }
}
}


fun plusFunction(
    employeesName: MutableList<String>,
    employeesSalary: MutableList<Double>,
    employeePeriods: MutableList<Int>
) {
    println("Add the New Name of Employee: ")
    var employeesName1 = readLine()
    println("Enter the salary rate of the Employee: ")
    var employeesSalary1 = readLine()?.toDoubleOrNull()
    println("Employee Period Pay: ")
    var employeePeriods1 = readLine()!!.toInt()
    if (employeesName1 != null) {
        employeesName.add(employeesName1.last().toString())
    }
    if (employeesSalary1 != null) {
        employeesSalary.add(employeesSalary1)
    }
    employeePeriods.add(employeePeriods1)
}