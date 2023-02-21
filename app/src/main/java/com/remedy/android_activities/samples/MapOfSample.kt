package com.remedy.android_activities.samples

class Foo{
    var count = 0
    fun something(){
        while (count < 20){
        this.count+=1
        println("something() was called $count times")
    }}
}

fun main(){
    val foo = Foo()
    foo.something()
    foo.something()
    foo.something()
    println("The final count was ${foo.count}")
}
