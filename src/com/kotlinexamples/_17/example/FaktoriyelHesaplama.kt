package com.kotlinexamples._17.example

// 10 elemanlı bir diziye eleman olarak dizi indexlerinin faktöriyellerini atayan bir uygulama

fun faktoriyelHesapla(sayi: Int): Int {
    var girilenSayi = sayi
    var sayac = 1
    var faktoriyel = 1

    if (girilenSayi == 0) {
        return 1
    }

    while (sayac <= girilenSayi) {
        faktoriyel *= sayac
        sayac++
    }
    return faktoriyel
}

fun main() {

    var onElemanliDizi = Array<Int>(10) { 0 }

    for (i in 0..onElemanliDizi.size - 1) {
        onElemanliDizi[i] = faktoriyelHesapla(i)
    }

    for (i in 0..onElemanliDizi.size - 1) {
        println("$i. indexteki elemanın faktöriyeli : " + onElemanliDizi[i])
    }
}