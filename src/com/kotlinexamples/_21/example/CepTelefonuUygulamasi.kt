package com.kotlinexamples._21.example

import java.util.*

// bir cep telefonunun bazı özelliklerini yapabilen bir uygulama yapınız
// bu uygulama;
// rehbere kişi ekleyebilmeli, sorgulayabilmeli, kişileri silip güncelleebilmeli
// bir kişi eklenirken veya güncellenirken o kişinin olup olmadığı kontrol edilmeli
// telefon menüsünde çıkış, tüm kişileri listele, yeni kişi ekle, kişi güncelle ve kişi sil olmalı
// İPUCU; kişi class'ı oluşturabilirsiniz ve tüm kişileri tutan bir arraylist'e sahip CepTelefonu class'ınız olsun

private val scanner = Scanner(System.`in`)
private val cepTelefonu = CepTelefonu("555-555-55-55")

fun telefonuBaslat() {
    println("Telefon başlatılıyor...")
}

fun menuGoster() {
    println("*************** MENÜ ***************")
    println("0 -> Çıkış \n" +
            "1 -> Tüm Kişileri Listele \n" +
            "2 -> Yeni Kişi Ekle \n" +
            "3 -> Kişi Sorgula \n" +
            "4 -> Kişi Sil \n" +
            "5 -> Kişi Güncelle \n" +
            "6 -> Menüyü Göster")
}

fun yeniKisiEkle() {
    print("Yeni kişinin adını giriniz : ")
    val isim = scanner.next()

    print("Yeni kişinin numarasını giriniz : ")
    val numara = scanner.next()

    cepTelefonu.yeniKisiEkle(Kisi.kisiOlustur(isim, numara))
}

fun kisiSorgula() {
    print("Aranacak kişinin adını giriniz : ")
    val isim = scanner.next()

    val bulunanKisi = cepTelefonu.kisiSorgula(isim)

    if (bulunanKisi == null) {
        println("Rehberde böyle bir kişi yok.")
        return
    } else {
        println("Bulunan Kişi : ${bulunanKisi.isim} --- ${bulunanKisi.telNo}")
    }
}

fun kisiSil() {
    print("Silinecek kişinin adı : ")
    val isim = scanner.next()

    val bulunanKisi = cepTelefonu.kisiSorgula(isim)

    if (bulunanKisi != null) {
        if (cepTelefonu.kisiSil(bulunanKisi!!)) {
            println("Kişi başarıyla silindi.")
        }
    } else {
        println("Böyle bir kişi yok.")
    }
}

fun kisiGuncelle() {
    print("Güncellenecek kişinin adı : ")
    val isim = scanner.next()

    val bulunanKisi = cepTelefonu.kisiSorgula(isim)

    if (bulunanKisi == null) {
        println("Kayıt bulunamadı.")
        return
    }

    print("Yeni kişinin adını giriniz : ")
    val yeniIsim = scanner.next()

    print("Yeni kişinin numarasını giriniz : ")
    val yeniNumara = scanner.next()

    cepTelefonu.kisiGuncelle(bulunanKisi, Kisi.kisiOlustur(yeniIsim, yeniNumara))
}

fun main() {
    telefonuBaslat()
    menuGoster()

    var cikis: Boolean = false

    while (!cikis) {
        print("Seçiminiz : ")
        var secim = scanner.nextInt()

        when (secim) {
            0 -> {
                println("Çıkış yapılıyor...")
                cikis = true
            }

            1 -> cepTelefonu.kisileriListele()

            2 -> yeniKisiEkle()

            3 -> kisiSorgula()

            4 -> kisiSil()

            5 -> kisiGuncelle()

            6 -> menuGoster()

            else -> println("Yanlış bir seçim yaptınız. Tekrar deneyiniz...")
        }
    }
}