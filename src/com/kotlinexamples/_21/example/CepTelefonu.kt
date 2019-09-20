package com.kotlinexamples._21.example

class CepTelefonu(val kendiNumaram: String) {

    private val rehber: ArrayList<Kisi>

    init {
        this.rehber = ArrayList()
    }

    fun kisiBul(aranacakKisi: Kisi): Int {
        return this.rehber.indexOf(aranacakKisi)
    }

    fun kisiBul(isim: String): Int {
        for (i in rehber.indices) {
            val oAnkiKisi = rehber[i]

            if (oAnkiKisi.isim.equals(isim)) {
                return i
            }
        }
        return -1
    }

    fun yeniKisiEkle(yeniKisi: Kisi): Boolean {

        if (kisiBul(yeniKisi.isim) >= 0) {
            println("${yeniKisi.isim} zaten rehberde kayıtlı.")
            return false
        }

        this.rehber.add(yeniKisi)
        println("Kişi başarılı bir şekilde eklendi.")
        return true
    }

    fun kisileriListele() {
        println("*************** REHBER ***************")
        if (rehber.size == 0) {
            println("Kayıtlı kişi yok.")
            return
        }

        for (oAnkiKisi: Kisi in rehber) {
            println("* ${oAnkiKisi.isim} --- ${oAnkiKisi.telNo}")
        }
    }

    fun kisiSorgula(isim: String): Kisi? {
        val position = kisiBul(isim)

        return if (position >= 0) {
            rehber[position]
        } else {
            return null
        }
    }

    fun kisiSil(silinecekKisi: Kisi): Boolean {
        val position = kisiBul(silinecekKisi)

        if (position < 0) {
            println("Böyle bir kişi yok.")
            return false
        }
        this.rehber.remove(silinecekKisi)
        println("Kişi başarıyla silindi.")
        return true
    }

    fun kisiGuncelle(eskiKisi: Kisi, yeniKisi: Kisi): Boolean {
        val bulunanPositin = kisiBul(eskiKisi)

        if (bulunanPositin < 0) {
            println("Böyle bir kayıt yok.")
            return false
        }

        rehber[bulunanPositin] = yeniKisi
        println("${eskiKisi.isim} kişisi ${yeniKisi.isim} ile güncellenmiştir.")
        return true
    }
}