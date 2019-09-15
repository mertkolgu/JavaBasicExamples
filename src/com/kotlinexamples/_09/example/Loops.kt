package com.kotlinexamples._09.example

// kendi adınızı ekrana 5 kere yazdıran uygulamayı tüm döngü ifadeleriyle yapınız

fun main() {

    var isim: String = "Mert Kolğu"

    println("*****For Loop*****")
    for (i in 1..5) {
        println(isim)
    }

    println("*****While Loop*****")
    var j: Int = 1
    while (j <= 5) {
        println(isim)
        j++
    }

    println("*****Do-While Loop*****")
    var k: Int = 1
    do {
        println(isim)
        k++
    } while (k <= 5)
}