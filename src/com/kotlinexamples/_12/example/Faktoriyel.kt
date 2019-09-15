package com.kotlinexamples._12.example

// klavyeden girilen bir sayının faktöriyelini bulunuz

fun main() {

    print("Bir Sayı Giriniz : ")
    var sayi: Int = readLine()!!.toInt()
    var sayac = 1
    var faktoriyel = 1

    while (sayac <= sayi) {
        faktoriyel *= sayac
        sayac++
    }

    println("$sayi sayısının faktöriyeli : $faktoriyel")
}