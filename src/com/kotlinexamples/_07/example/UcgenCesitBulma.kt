package com.kotlinexamples._07.example

// klavyeden kenarları girilen bir üçgenin çeşidini veren uygulamayı yazınız

fun main() {

    print("Birinci Kenarı Giriniz : ")
    var birinciKenar: Int = readLine()!!.toInt()
    print("İkinci Kenarı Giriniz : ")
    var ikinciKenar: Int = readLine()!!.toInt()
    print("Üçüncü Kenarı Giriniz : ")
    var ucuncuKenar: Int = readLine()!!.toInt()

    if ((birinciKenar == ikinciKenar) && (birinciKenar == ucuncuKenar)) {
        println("Girilen üçgen eşkenar bir üçgendir.")
    } else if ((birinciKenar != ikinciKenar) && (birinciKenar != ucuncuKenar) && (ikinciKenar != ucuncuKenar)) {
        println("Girilen üçgen çeşitkenar bir üçgendir.")
    } else {
        println("Girilen üçgen ikizkenar bir üçgendir.")
    }
}