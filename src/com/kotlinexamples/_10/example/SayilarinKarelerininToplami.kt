package com.kotlinexamples._10.example

// 1'den 100'e kadar olan sayıların kareleri toplamını bulun

fun main() {

    var toplam: Int = 0
    for (i in 1..100) {
        toplam += (i * i)
    }
    println("1'den 100'e kadar sayıların kareleri toplamı : $toplam")
}