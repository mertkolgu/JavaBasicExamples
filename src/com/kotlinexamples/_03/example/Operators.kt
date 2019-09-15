package com.kotlinexamples._03.example

// aşağıdaki kod bloğunun çıktısı nedir?

fun main() {
    var i: Int = 5
    i = i++     // Warning:(7, 9) Kotlin: The value changed at 'i++' is never used
    i = ++i
    println("i değeri : " + i)  // 6
}