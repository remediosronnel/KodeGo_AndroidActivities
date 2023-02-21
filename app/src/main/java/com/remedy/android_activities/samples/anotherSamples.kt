package com.remedy.android_activities.samples

import kotlin.math.sign

fun main(){

    val titleBook:ArrayList<String> = arrayListOf("Biology", "Modern Mathematics", "Cooking Book")
    val authorBook:ArrayList<String> = arrayListOf("Rodulfo P. Sorpresa", "Bubbles Casal", "Letecia Andrada")
    val publicationBook:ArrayList<Int> = arrayListOf(1968, 1945, 1568)

    bookAdded(titleBook, authorBook, publicationBook)
}

fun bookAdded(titleBook: ArrayList<String>, authorBook: ArrayList<String>,publicationBook: ArrayList<Int>) {
    println("========================================================================")

    while (true) {

        println("Welcome to the Library")
        println(" Add  ")
        println(" Remove ")
        println(" Display ")
        println(" Search")
        println(" Exit ")
        println("========================================================================")
        print("Choose your Destiny ")
        when(readln()){

            "Add" -> {
                println("Please Enter the Title of the New Book: ")
                var titleBookString = readLine()
                println("Please enter the Author of the Book: ")
                var authorBookString = readLine()
                println("Please Enter the Year of Publication of the new Book: ")
                var bookYearString = readLine()!!.toInt()
                titleBook.add(titleBookString.toString())
                authorBook.add(authorBookString.toString())
                publicationBook.add(bookYearString)
                println("Successfully Added! \n")
            }
            "Remove" -> {
                print("Catalog List: \n")
                titleBook.forEachIndexed{ index, bookTitle ->
                    println("${index + 1}. $bookTitle - ${authorBook[index]} - ${publicationBook[index]} ")

                }
                println("Select an Index to remove: ")
                val index = readLine()?.toIntOrNull()?.minus(1) ?: -1
                if (index in 0 until titleBook.size) {
                    titleBook.removeAt(index)
                    authorBook.removeAt(index)
                    publicationBook.removeAt(index)

                    println("Book removed successfully \n")
                }else{
                    println("Invalid index! Wala siya sa Array! \n")
                }
            }
            "Display" ->{
                titleBook.forEachIndexed { index, bookTitle ->

                    println("${index + 1}. $bookTitle - ${authorBook[index]} - ${publicationBook[index]}")

                }}
            "Search" ->{
                println("Search the Title of the Book ")
                var bookToBeSearch = readLine() ?: ""
                val element = titleBook.indexOf(bookToBeSearch)
                    if (titleBook.contains(bookToBeSearch)){
                        println("${titleBook[element]} by ${authorBook[element]} Publication date: ${publicationBook[element]}")
                    }else{
                        println("No Information \n")

                    }

//                titleBook.forEachIndexed{index, bookName ->
//                    if (bookName.contains(bookToBeSearch, ignoreCase = true)){
//                        println(" You found ${titleBook[index]} by ${authorBook[index]} Publication Date: ${publicationBook[index]}")
//                    }
//                }

            }
            "Exit" -> {
                return

            }else -> {
                print("Invalid! Enter again: ")
            }

        }


    }
}