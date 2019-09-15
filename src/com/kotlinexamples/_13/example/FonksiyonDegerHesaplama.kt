package com.kotlinexamples._13.example

/*
    Aşağıda tanımı verilen f(x,y) fonksiyonunu klavyeden girilen x ve y değerleri için hesaplayınız

    x>0, y<0 ise f(x,y) = 4x+2y+4
    x>0, y=0 ise f(x,y) = 2x-y+3
    x<0, y>0 ise f(x,y) = 3x+4y+3
 */

fun main() {

    print("x değerini giriniz : ")
    var x = readLine()!!.toInt()
    print("y değerini giriniz : ")
    var y = readLine()!!.toInt()

    var sonuc = 0

    if (x > 0 && y < 0) {
        sonuc = 4 * x + 2 * y + 4
    } else if (x > 0 && y == 0) {
        sonuc = 2 * x - y + 3
    } else if (x < 0 && y > 0) {
        sonuc = 3 * x + 4 * y + 3
    } else {
        println("Çözüm yok.")
    }
    println("Sonuç : $sonuc")
}