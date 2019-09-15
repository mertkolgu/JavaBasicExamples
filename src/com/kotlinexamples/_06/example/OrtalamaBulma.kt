package com.kotlinexamples._06.example

// klavyeden girilen üç sayının ortalamasını alan bir uygulama yazınız

fun main() {

    print("Birinci sayıyı giriniz : ")
    var sayi1: Int = readLine()!!.toInt()
    print("İkinci sayıyı giriniz : ")
    var sayi2: Int = readLine()!!.toInt()
    print("Üçüncü sayıyı giriniz : ")
    var sayi3: Int = readLine()!!.toInt()

    var ortalama: Double = (sayi1 + sayi2 + sayi3).toDouble() / 3
    print("Girilen sayıların ortalaması : $ortalama")
}