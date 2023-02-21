package com.remedy.android_activities.samples


fun main() {
    var itemIteration = true

    var empleYado = mutableListOf<String>()
    var salaryEmployee = mutableListOf<Double>()
    var periodEmployee = mutableListOf<Int>()

    while (itemIteration){

        plusEmployeeFunction(empleYado, salaryEmployee, periodEmployee)

        empleYado.forEachIndexed { index, name ->
            println(
                "${index + 1}. Name: $name - Salary Rate: ${salaryEmployee[index]} - Pay Period: ${salaryEmployee[index]} " +
                        "Total Pay: ${periodEmployee[index] * periodEmployee[index]}"

            )
        index+1
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


fun plusEmployeeFunction(
    empleYado: MutableList<String>,
    salaryEmployee: MutableList<Double>,
    periodEmployee: MutableList<Int>
) {
    println("Add the New Name of Employee: ")
    var employeesName1 = readLine()
    println("Enter the salary rate of the Employee: ")
    var employeesSalary1 = readLine()?.toDoubleOrNull()
    println("Employee Period Pay: ")
    var employeePeriods1 = readLine()!!.toInt()
    if (employeesName1 != null) {
        empleYado.add(employeesName1)
    }
    if (employeesSalary1 != null) {
        salaryEmployee.add(employeesSalary1)
    }
    periodEmployee.add(employeePeriods1)
}

