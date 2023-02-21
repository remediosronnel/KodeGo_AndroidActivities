package com.remedy.android_activities.samples



fun main() {
    var menuItems = arrayListOf(
        "Spaghetti Bolognese" to 12.99,
        "Margherita Pizza" to 10.99,
        "Caesar Salad" to 8.99 )

    while(true) {


        println("\n Welcome to the Restaurant Menu!")
        println("Menu: ")

        for (menuItem in menuItems) {
            val (name, price) = menuItem
            println("- $name ($$price)")
        }

        println("\nPlease enter the name of the new menu item:")
        val name = readLine() ?: ""

        println("\nPlease enter the price of the new menu item:")
        val price = readLine()?.toDoubleOrNull() ?: 0.0

        val newMenuItem = name to price
        var updatedMenuItems = menuItems + newMenuItem

        println("\nMenu updated successfully!\n")
        println("Menu:")


        for (name in updatedMenuItems) {
            val (name, price) = updatedMenuItems
            println("- $name ($$price)")
        }
    }
}