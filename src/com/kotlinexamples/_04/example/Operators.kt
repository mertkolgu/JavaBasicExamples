package com.kotlinexamples._04.example

// aşağıdaki kod bloğunun çıktısı kaçtır?

fun main() {
    var sonuc: Int = 2 + +8 - -2 + +8 - -2 + +8
    // 2 + (+8) - (-2) + (+8) - (-2) + (+8)
    // 2 + 8 + 2 + 8 + 2 + 8
    println("Sonuç : " + sonuc)  // 30
}