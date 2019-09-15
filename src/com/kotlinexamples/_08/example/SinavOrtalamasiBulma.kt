package com.kotlinexamples._08.example

// klavyeden girilen vize ve final notlarına göre öğrencinin dersi geçip geçmediğini söyleyen
// bir uygulama yazınız (geçme notu : 60, vizenin %40'ı, finalin %60'ı geçerlidir.)

fun main() {

    print("Vize Notunuzu Giriniz : ")
    var vizeNotu: Int = readLine()!!.toInt()
    print("Final Notunuzu Giriniz : ")
    var finalNotu: Int = readLine()!!.toInt()


    var ortalama: Double = (vizeNotu * 0.4) + (finalNotu * 0.6)

    if (ortalama >= 60) {
        print("Tebrikler dersi geçtiniz. Ortalamanız : $ortalama")
    } else {
        print("Ortalamanız : $ortalama. Yaz okulunun yolu göründü...")
    }
}