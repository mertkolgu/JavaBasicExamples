package com.javaexamples._21.example;

import java.util.Scanner;

public class SarkiciProjesi {

    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner sc = new Scanner(System.in);

    public static void islemleriBastir() {

        String[] islemler = {"0 - İşlemleri Görüntüle", "1 - Şarkıcıları Görüntüle", "2 - Şarkıcı Ekle",
                "3 - Şarkıcı Güncelle", "4 - Şarkıcı Sil", "5 - Şarkıcı Ara", "6 - Uygulamadan Çık",};

        for (String s : islemler)
            System.out.println(s);
    }

    public static void sarkiciGoruntule() {
        sarkicilar.sarkicilariBastir();
    }

    public static void sarkiciEkle() {
        System.out.print("Eklemek istediğiniz şarkıcının ismi : ");
        String isim = sc.nextLine();
        sarkicilar.sarkiciEkle(isim);
    }

    public static void sarkiciGuncelle() {
        System.out.print("Güncellemek istediğiniz pozisyon : ");
        int pozisyon = sc.nextInt();
        sc.nextLine();

        System.out.print("Yeni şarkıcı ismi : ");
        String yeniIsim = sc.nextLine();
        sarkicilar.sarkiciGuncelle(yeniIsim, pozisyon - 1);
    }

    public static void sarkiciSil() {
        System.out.print("Silmek istediğiniz pozisyon : ");
        int pozisyon = sc.nextInt();
        sarkicilar.sarkiciSil(pozisyon - 1);
    }

    public static void sarkiciAra() {
        System.out.print("Aramak istediğiniz şarkıcı : ");
        String isim = sc.nextLine();
        sarkicilar.sarkiciAra(isim);
    }

    public static void main(String[] args) {

        boolean cikis = false;
        int islem;

        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz...");

        islemleriBastir();

        while (!cikis) {
            System.out.print("Bir İşlem Seçiniz : ");
            islem = sc.nextInt();
            sc.nextLine();

            switch (islem) {
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    sarkiciGoruntule();
                    break;
                case 2:
                    sarkiciEkle();
                    break;
                case 3:
                    sarkiciGuncelle();
                    break;
                case 4:
                    sarkiciSil();
                    break;
                case 5:
                    sarkiciAra();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan Çıkılıyor.");
                    break;
            }
        }
    }
}