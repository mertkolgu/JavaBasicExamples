package com.javaexamples._26.example;

public class Sayisal extends Aday {

    public Sayisal(String isim, int turkce, int matematik, int edebiyat, int fizik) {
        super(isim, turkce, matematik, edebiyat, fizik);
    }

    @Override
    int puanHesapla() {
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 4 + getEdebiyat() * 1;
    }
}