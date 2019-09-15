package com.kotlinexamples._02.example

// kullanıcıdan iki sayı alınız ve tüm aritmetik operatörleri uygulayarak ekrana bilgi mesajları ile yazdırınız

fun main() {

    print("Birinci sayıyı giriniz : ")
    var sayi1: Int = readLine()!!.toInt()
    print("İkinci sayıyı giriniz : ")
    var sayi2: Int = readLine()!!.toInt()

    println("$sayi1 ve $sayi2 toplamı : " + (sayi1 + sayi2))
    println("$sayi1 ve $sayi2 farkı : " + (sayi1 - sayi2))
    println("$sayi1 ve $sayi2 çarpımı : " + (sayi1 * sayi2))
    println("$sayi1 ve $sayi2 bölümü : " + (sayi1.toDouble() / sayi2.toDouble()))
}