package com.kotlinexamples._01.example

/*
    adınızı, soyadınızı, yaşınızı, kilonuzu, boyunuzu, cinsiyetinizi (E -> Erkek, K -> Kadın)
    ilgili değişkenlere atayın ve aşağıdaki formüle göre boy/kilo indeksinizi hesaplayıp
    tüm verileri ekrana yazdırın

    NASIL HESAPLANIR
    sağlıklı bir kiloda olup olmadığınızı öğrenmek için, kilo ve boy orantınızı hesaplayın.
    Boy(M) * Boy(M) = Boy çarpımı
    Kilo (kg) / boy çarpımı = VKİ
    VKİ:
    18.5 kg/m2'nin altında ise : ZAYIF
    18.5-24.9 kg/m2 arasında ise : NORMAL
    25-29.9 kg/m2 arasında ise : Fazla kilolu
 */

fun main() {

    // ilgili veriler değişkenlere atandı
    val isim: String = "Mert"
    val soyad: String = "Kolğu"
    val cinsiyet: Char = 'E'
    var yas: Byte = 23
    var kilo: Double = 93.2
    var boy: Double = 1.83

    // vki hesaplama
    var boyDegerininKaresi: Double = boy * boy
    var vki: Double = kilo / boyDegerininKaresi

    // bilgi mesajlarının yazılması
    println("Adı : $isim Soyadı : $soyad")
    println("Yaş : $yas Cinsiyet : $cinsiyet")
    println("Kilo : $kilo Boy : $boy")
    println("Vücut Kitle İndeksiniz : $vki")
}