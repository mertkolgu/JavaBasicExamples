package com.javaexamples._18.example;

public class Yonetici extends Employee {

    private int sorumluKisiSayisi;

    public Yonetici(String ad, String soyad, int id, int sorumluKisiSayisi) {
        super(ad, soyad, id);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı : " + sorumluKisiSayisi);
    }

    public void zamYap(int zamMiktari) {
        System.out.println(getAd() + " çalışanlara " + zamMiktari + " tl kadar zam yapıyor.");
    }
}