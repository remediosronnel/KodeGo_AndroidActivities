package com.remedy.android_activities.Week3

import android.icu.text.AlphabeticIndex.ImmutableIndex

var index1 = 0
//Activity 5
fun main(){

    var employeesName = mutableListOf<String>()
    var employeeSumSalary = mutableListOf<Float>()
    var employeeIndex = mutableListOf<Int>()
    var choice2 = true
    while (choice2) {
        println("Type yes to ADD employee and no for the SUMMARY")
        var choice3 = readLine()
        if (choice3=="yes") {
            addName(employeesName, employeeSumSalary, employeeIndex)
        }else if( choice3  == "no"){
            showEmployees(employeesName, employeeSumSalary, employeeIndex)
            choice2 = false
        }else{
            println("Invalid").also { print("Again!") }
        }
    }
}

fun addName(employeesName: MutableList<String>, employeeSumSalary:MutableList<Float>, employeeIndex: MutableList<Int>) {
    var choice = true
    var sumSalary = 0.00f
    while (choice){
        println("Enter the name of employees: ")
        var employeeName = readLine() ?: " "
        employeesName.add(employeeName)
        println("Enter the Salary of $employeeName : ")
        while (choice){
            var choice = readLine()?.toFloatOrNull()
            when(choice) {
                is Float -> {
                    sumSalary += choice
                }
                else -> {
                    employeeSumSalary.add(sumSalary)
                    employeeIndex.add(index1)
                    index1 = 0
                    println("Employee added successfully! ")
                    return
                }
            }
            index1 += 1
        }
    }
}

fun showEmployees(
    employeesName: MutableList<String>,
    employeeSumSalary: MutableList<Float>,
    employeeIndex: MutableList<Int>
){

    employeesName.forEachIndexed { index, name ->
        println(
            "Salary Summary: \n" +
                    "$name:\n - Total Salary: ${employeeSumSalary[index]} " +
                    "\n - Pay Periods Worked: ${employeeIndex[index]} "
        )
    }
}