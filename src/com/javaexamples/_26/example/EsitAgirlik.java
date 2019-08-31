package com.javaexamples._26.example;

public class EsitAgirlik extends Aday {

    public EsitAgirlik(String isim, int turkce, int matematik, int edebiyat, int fizik) {
        super(isim, turkce, matematik, edebiyat, fizik);
    }

    @Override
    int puanHesapla() {
        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 1 + getEdebiyat() * 4;
    }
}