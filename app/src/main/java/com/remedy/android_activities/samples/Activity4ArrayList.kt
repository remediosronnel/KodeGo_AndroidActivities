package com.remedy.android_activities.samples

fun main(){

    val titleBook:ArrayList<String> = arrayListOf("Biology", "Modern Mathematics")
    val authorBook:ArrayList<String> = arrayListOf("Rodulfo P. Sorpresa", "Bubbles Casal")
    val publicationBook:ArrayList<Int> = arrayListOf(1968, 1945)

    bookAdded(titleBook, authorBook, publicationBook)
}

fun bookAdded(titleBook: ArrayList<String>, authorBook: ArrayList<String>,publicationBook: ArrayList<Int>) {
  println("========================================================================")

   while (true) {

       println("Welcome to the Grocery Store")
       println(" Add  ")
       println(" Remove ")
       println(" Display ")
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
           }
           "Remove" -> {
               print("Catalog List: ")
               titleBook.forEachIndexed{ index, bookTitle ->
                println("${index + 1}. $bookTitle ${authorBook[index]} ${publicationBook[index]} ")

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

                       println("${index + 1}. $bookTitle ${authorBook[index]} ${publicationBook[index]}")


           }}
           "Exit" -> {
               return
           }

       }


   }
}