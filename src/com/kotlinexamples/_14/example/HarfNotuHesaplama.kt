package com.kotlinexamples._14.example

// 100'lük sistemde verilen notları harfli sistemde gösteren bir uygulama yazınız (range kullanmadan)

fun main() {

    print("Notunuzu giriniz : ")
    var not = readLine()!!.toInt()

    var notSiniri = not - (not % 10)

    var sonuc = when (notSiniri) {
        90 -> "AA"
        80 -> "BA"
        70 -> "BB"
        60 -> "CB"
        50 -> "CC"
        else -> "FF"
    }
    println(sonuc)
}