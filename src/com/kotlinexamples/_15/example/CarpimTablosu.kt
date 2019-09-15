package com.kotlinexamples._15.example

// çarpım tablosunu oluşturunuz

fun main() {

    for (i in 1..10) {
        for (j in 1..10) {
            print("$i * $j = ${i * j}\t")
        }
        println()
        println()
    }
}