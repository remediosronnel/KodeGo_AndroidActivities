package com.remedy.android_activities



//Merge Sort: Write a program that implements the merge sort algorithm.
//Instructions:
//
//Take an input array from the user
//Use the divide and conquer approach to sort the array
//Create a helper function to merge two sorted arrays
//Use the helper function to sort the input array
//Print the sorted array.


//ACTIVITY 1

fun main(args: Array<String>) {
    val numbers1 = mutableListOf<Int>(8,10,15, 1, 2, 7, 12, 6)
    val number2 = mutableListOf<Int>(6, 3, 9, 4, 5, 20, 11)
    val numberS = mergeArrays(numbers1, number2)
    val sortedList = divideConquer(numberS)
    println("Sorted: $sortedList")
}
fun mergeArrays(array1: List<Int>, array2:List<Int>): List<Int> {
    var arrayS = array1.plus(array2).toList()
    return arrayS
}

fun divideConquer(list: List<Int>): List<Int> {
    if (list.size <= 1) {
        return list
    }

    val middle = list.size / 2
    var left = list.subList(0,middle);
    var right = list.subList(middle,list.size);

    return merge(divideConquer(left), divideConquer(right))
}

fun merge(left: List<Int>, right: List<Int>): List<Int>  {
    var indexLeft = 0
    var indexRight = 0
    var newList : MutableList<Int> = mutableListOf()

    while (indexLeft < left.count() && indexRight < right.count()) {
        if (left[indexLeft] <= right[indexRight]) {
            newList.add(left[indexLeft])
            indexLeft++
        } else {
            newList.add(right[indexRight])
            indexRight++
        }
    }
//    for (indexLeft in left.iterator()){
//        newList.add(left[indexLeft])
//
//    }

////    do {
////
////        newList.add(left[indexLeft])
////        indexLeft++
//    }while (indexLeft< left.size)
    while (indexLeft < left.size) {
        newList.add(left[indexLeft])
        indexLeft++
    }

    while (indexRight < right.size) {
        newList.add(right[indexRight])
        indexRight++
    }
    return newList;
}