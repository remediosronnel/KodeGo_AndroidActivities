package com.remedy.android_activities.Week3

//Activity 1
fun main(args: Array<String>) {
    val phoneNumber = readLine()

    if(phoneNumber?.length == 10){
        var str1 = phoneNumber.substring(0, 3)
        var str2 = phoneNumber.substring(3, 6)
        var str3 = phoneNumber.substring(6, 10)
        var concaString = "($str1) $str2-$str3"
        var concaString1 = "(+63$str1) $str2-$str3"
        println(concaString); print(concaString1)
    }else{
        print("Invalid")
    }


}

