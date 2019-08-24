package com.javaexamples._21.example;

import java.util.ArrayList;

public class Sarkicilar {

    private ArrayList<String> sarkiciListesi = new ArrayList<>();

    public void sarkicilariBastir() {
        System.out.println("Şarkıcı listesinde " + sarkiciListesi.size() + " kadar şarkıcı var.");

        for (int i = 0; i < sarkiciListesi.size(); i++) {
            System.out.println((i + 1) + ". Şarkıcı : " + sarkiciListesi.get(i));
        }
    }

    public void sarkiciEkle(String isim) {
        sarkiciListesi.add(isim);
        System.out.println("Şarkıcı listesi güncellendi.");
    }

    public void sarkiciGuncelle(String yeniIsim, int pozisyon) {
        sarkiciListesi.set(pozisyon, yeniIsim);
        System.out.println("Şarkıcı listesi güncellendi.");
    }

    public void sarkiciSil(int pozisyon) {
        String isim = sarkiciListesi.get(pozisyon);
        sarkiciListesi.remove(pozisyon);
        System.out.println(isim + " isimli şarkıcı listeden silindi.");
    }

    public void sarkiciAra(String sarkiciIsmi) {

        int pozisyon = sarkiciListesi.indexOf(sarkiciIsmi);

        if (pozisyon >= 0) {
            System.out.println("Şarkıcı bulundu.");
            System.out.println(sarkiciIsmi + " isimli şarkıcı " + (pozisyon + 1) + ". pozisyonda.");
        } else {
            System.out.println("Şarkıcı bulunamadı.");
        }
    }
}