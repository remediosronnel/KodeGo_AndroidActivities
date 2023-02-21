package com.remedy.android_activities.samples

fun main(args: Array<String>){

    var list = mutableListOf<Int>()
    var name = list as MutableList<String>
//    name.set(3, "Three")
//    name[0] = "zero"
//    name.fill("bulldozer")
    name.replaceAll{ "Remedy" }
    println(name.toString())

}

