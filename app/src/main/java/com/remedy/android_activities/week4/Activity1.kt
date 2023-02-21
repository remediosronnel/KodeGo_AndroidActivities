package com.remedy.android_activities.week4

//Activity 1 - HashMap
fun main() {

    val myDictionary: HashMap<String, String> = hashMapOf()

    while (true) {
       println("================CHOOSE================")
       println(" 1. ADDING WORDS")
       println(" 2. SEARCH THE WORD")
       println(" 3. DISPLAY WORDS")
       println("Click Anything to Exit")
       println("=======================================\n")

       when(readLine()?.toIntOrNull() ?: String) {
           1 -> {
               println("Enter the Word: ")
               val words = readLine()?.uppercase() ?: " "
               println("Enter the Definition: ")
               val defWord = readLine()?.uppercase() ?: " "
               myDictionary[words] = defWord
               println("Successfully Added!! \n")
           }2 -> {
              println("Enter the Word you want to Search: ")
                val searchWord = readLine()?.uppercase() ?: " "
           for(word in 1..1) {
               if (myDictionary.contains(searchWord)) {

                   println("Word: $searchWord  Meaning: ${myDictionary[searchWord]} \n")
                   continue
               }else{
                   println("No words")
               }
           }
           }3 -> {
           println("=============WORD DEFINITION=============")
           displayWordsDef(myDictionary)
           continue
           }

           else ->{
           println("EXIT ")
           return

           }
       }
   }
}

fun displayWordsDef(myDictionary: HashMap<String, String>) {
    for((key,value) in myDictionary){

        println("The word $key  with Definition: ${value.lowercase()}")
    }
}


