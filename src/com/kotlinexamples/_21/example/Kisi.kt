package com.kotlinexamples._21.example

class Kisi(var isim: String, var telNo: String) {

    companion object {
        fun kisiOlustur(isim: String, telNo: String): Kisi {
            return Kisi(isim, telNo)
        }
    }
}