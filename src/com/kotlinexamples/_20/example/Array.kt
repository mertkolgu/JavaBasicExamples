package com.kotlinexamples._20.example

// boyutu ve elemanlarını kullanıcının belirlediği bir dizinin elemanlarının toplam değeri

fun main() {

    print("Dizinin eleman sayısını giriniz : ")
    var diziBoyutu = readLine()!!.toInt()

    var olusturulanDizi = Array<Int>(diziBoyutu) { 0 }
    var toplam = 0

    for (i in 0..olusturulanDizi.size - 1) {
        print("Sayı giriniz : ")
        olusturulanDizi[i] = readLine()!!.toInt()
        toplam += olusturulanDizi[i]
    }
    println("Toplam : " + toplam)
}