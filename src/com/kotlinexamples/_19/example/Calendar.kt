package com.kotlinexamples._19.example

import java.util.Calendar

// çalıştığında hangi ayda olduğumuzu string olarak belirten uygulama

fun main() {

    var months = arrayOf("Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran",
            "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık")

    var thisMonthIndex = Calendar.getInstance().get(Calendar.MONTH)

    println(months[thisMonthIndex])
}