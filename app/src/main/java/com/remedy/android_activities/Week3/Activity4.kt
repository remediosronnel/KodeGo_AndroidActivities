package com.remedy.android_activities.Week3


fun main(){

    val titleBook:ArrayList<String> = arrayListOf("Biology", "Modern Mathematics", "Cooking Book")
    val authorBook:ArrayList<String> = arrayListOf("Rodulfo P. Sorpresa", "Bubbles Casal", "Letecia Andrada")
    val publicationBook:ArrayList<Int> = arrayListOf(1968, 1945, 1568)

    bookAdded(titleBook, authorBook, publicationBook)
}

fun bookAdded(titleBook: ArrayList<String>, authorBook: ArrayList<String>,publicationBook: ArrayList<Int>) {
    println("========================================================================")

    while (true) {

        println("Welcome to the Grocery Store")
        println(" Add  ")
        println(" Remove ")
        println(" Display ")
        println(" Search")
        println(" Exit ")

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
                println("Successfully Added! ")
            }
            "Remove" -> {
                print("Catalog List: \n")
                titleBook.forEachIndexed{ index, bookTitle ->
                    println("${index + 1}. $bookTitle - ${authorBook[index]} - ${publicationBook[index]} ")

                }
                println("Select an index to remove: ")
                val index = readLine()?.toIntOrNull()?.minus(1) ?: -1
                if (index in 0 until titleBook.size) {
                    titleBook.removeAt(index)
                    authorBook.removeAt(index)
                    publicationBook.removeAt(index)

                    println("Book removed successfully ")
                }else{
                    println("Invalid index! Wala siya sa Array! ")
                }
            }
            "Display" ->{
                titleBook.forEachIndexed { index, bookTitle ->

                    println("${index + 1}. $bookTitle - ${authorBook[index]} - ${publicationBook[index]}")

                }}
            "Search" ->{
                println("Search the Title of the Book ")
                val bookToBeSearch = readLine() ?: ""
                val searchBook = titleBook.first {
                    it.contains(
                        bookToBeSearch,
                        ignoreCase = true
                    )
                }
                var element = titleBook.indexOf(searchBook)
                println("You found ${titleBook[element]}")

                titleBook.forEachIndexed{index, bookName ->
                    if (bookName.contains(bookToBeSearch, ignoreCase = true)){
                        println(" You found ${titleBook[index]} by ${authorBook[index]} Publication Date: ${publicationBook[index]}")
                    }
                }

            }
            "Exit" -> {
                return

            }else -> {
            print("Invalid! Enter again: ")
        }

        }


    }
}