package com.kotlinexamples._11.example

// 1'den 100'e, 100'den 1'e olan sayıları 7'şer 7'şer yazın

fun main() {

    var sayiAralik: IntRange = 1..100
    var sayiAralikReverse: IntProgression = 100.downTo(1).step(7)

    for (sayi in sayiAralik.step(7)) {
        print("$sayi, ")
    }

    println("\n**********************************************************")

    for (sayi in sayiAralikReverse) {
        print("$sayi, ")
    }
}