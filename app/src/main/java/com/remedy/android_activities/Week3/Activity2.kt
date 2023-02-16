package com.remedy.android_activities.Week3

//Activity 2
fun main() {

    val docufile: String? = readLine()
    val parts = docufile?.split(".")
    val typeOfFile = parts?.last()
    println("File Type: $typeOfFile")


}