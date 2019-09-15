package com.kotlinexamples._05.example

// aşağıdaki kod bloğunda i kaçtır?

fun main() {
    var i: Int = 5
    i = i++ + ++i - i-- - --i
    // 5 + 7 - 7 - 5
    println("i değeri : " + i)  // 0
}