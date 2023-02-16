package com.remedy.android_activities.Week3

//import java.util.*

import java.util.ArrayDeque
//Activity 3
fun main(args: Array < String > ) {
    val string = readLine()
    val stackString = ArrayDeque<String>()
    println("\nThe inputs:  $string")
    val st1 = stackString
    for (words in string!!.split(" ")) {
        st1.push(words)
    }
    var reverseString = " "
    for (i in 0..st1.size - 1) {
        reverseString += st1.pop()
        if (i != st1.size) {
            reverseString += " "
        }
    }
    print("Results:    $reverseString")
}

//"the quick brown fox jumps over the lazy dog"