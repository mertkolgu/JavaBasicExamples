package com.kotlinexamples._16.example

import java.util.Calendar

fun tarihGoster(): String {
    val calender = Calendar.getInstance()
    var hour = calender.get(Calendar.HOUR)
    var minute = calender.get(Calendar.MINUTE)
    var second = calender.get(Calendar.SECOND)
    return "$hour:$minute:$second"
}

fun menuGoster(): Int {
    var tarih = tarihGoster()
    println("**********MENÜ | $tarih | **********")
    println("1 - Toplama")
    println("2 - Çıkarma")
    println("3 - Çarpma")
    println("4 - Bölme")
    println("5 - Çıkış")
    print("Seçiminiz : ")
    var secim = readLine()!!.toInt()
    return secim
}

fun toplama(sayi1: Int, sayi2: Int) {
    println("Sayıların toplamı : " + (sayi1 + sayi2))
}

fun cikarma(sayi1: Int, sayi2: Int) {
    println("Sayıların farkı : " + (sayi1 - sayi2))
}

fun carpma(sayi1: Int, sayi2: Int) {
    println("Sayıların çarpımı : " + (sayi1 * sayi2))
}

fun bolme(sayi1: Int, sayi2: Int) {
    if (sayi2 != 0) {
        println("Sayıların bölümü : " + (sayi1.toDouble() / sayi2.toDouble()))
    } else {
        println("Bölen sıfır olamaz.")
    }
}

fun main() {

    while (true) {
        var kullaniciSecimi = menuGoster()

        if (kullaniciSecimi in 1..4) {
            print("Birinci sayıyı giriniz : ")
            var sayi1 = readLine()!!.toInt()
            print("İkinci sayıyı giriniz : ")
            var sayi2 = readLine()!!.toInt()

            when (kullaniciSecimi) {
                1 -> toplama(sayi1, sayi2)
                2 -> cikarma(sayi1, sayi2)
                3 -> carpma(sayi1, sayi2)
                4 -> bolme(sayi1, sayi2)
            }
        } else if (kullaniciSecimi == 5) {
            println("Programdan çıkılıyor...")
            break
        } else {
            println("Geçersiz işlem girdiniz...")
        }
    }
}