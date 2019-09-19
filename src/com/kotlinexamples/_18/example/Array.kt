package com.kotlinexamples._18.example

// kullanıcıdan alınan 5 sayıyı diziye atayan ve atama işlemi bittikten sonra ekran yazdırın

fun main() {

    var kullanicidanGelenSayilar = Array<Int>(5) { 0 }

    for (i in 0..kullanicidanGelenSayilar.size - 1) {
        print("Sayi giriniz : ")
        kullanicidanGelenSayilar[i] = readLine()!!.toInt()
    }

    for (i in kullanicidanGelenSayilar) {
        println(i)
    }
}