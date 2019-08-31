package com.javaexamples._26.example;

import java.util.Scanner;

public class SinavBirincisiHesaplama {

    public static <E extends Aday> E birinci(E e1, E e2, E e3) {
        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {
            return e1;
        } else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {
            return e2;
        } else if (e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla()) {
            return e3;
        } else {
            return e1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] islemler = {"İşlemler", "1 - Eşit Ağırlık Öğrencileri Birincisi", "2 - Sayısal Öğrencileri Birincisi"};

        System.out.println("Üniversite Sınavı Birincisi Bulma Programı");
        System.out.println("******************************************");

        for (String s : islemler)
            System.out.println(s);

        System.out.println("******************************************");

        while (true) {
            System.out.print("Çıkış için q'ya devam etmek için herhangi bir tuşa basın.");
            String cikis = sc.nextLine();

            if (cikis.equalsIgnoreCase("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }

            // Birinci öğrenci
            System.out.print("Birinci Öğrenci İsmi : ");
            String isim1 = sc.nextLine();
            System.out.print("Türkçe Neti : ");
            int turkceNet1 = sc.nextInt();
            System.out.print("Matematik Neti : ");
            int matNet1 = sc.nextInt();
            System.out.print("Edebiyat Neti : ");
            int edebiyatNet1 = sc.nextInt();
            System.out.print("Fizik Neti : ");
            int fizikNet1 = sc.nextInt();
            sc.nextLine();

            // İkinci Öğrenci
            System.out.print("İkinci Öğrenci İsmi : ");
            String isim2 = sc.nextLine();
            System.out.print("Türkçe Neti : ");
            int turkceNet2 = sc.nextInt();
            System.out.print("Matematik Neti : ");
            int matNet2 = sc.nextInt();
            System.out.print("Edebiyat Neti : ");
            int edebiyatNet2 = sc.nextInt();
            System.out.print("Fizik Neti : ");
            int fizikNet2 = sc.nextInt();
            sc.nextLine();

            // Üçüncü Öğrenci
            System.out.print("Üçüncü Öğrenci İsmi : ");
            String isim3 = sc.nextLine();
            System.out.print("Türkçe Neti : ");
            int turkceNet3 = sc.nextInt();
            System.out.print("Matematik Neti : ");
            int matNet3 = sc.nextInt();
            System.out.print("Edebiyat Neti : ");
            int edebiyatNet3 = sc.nextInt();
            System.out.print("Fizik Neti : ");
            int fizikNet3 = sc.nextInt();
            sc.nextLine();

            System.out.print("İşlemi Seçiniz : ");
            String islem = sc.nextLine();

            if (islem.equals("1")) {
                EsitAgirlik ogrenci1 = new EsitAgirlik(isim1, turkceNet1, matNet1, edebiyatNet1, fizikNet1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(isim2, turkceNet2, matNet2, edebiyatNet2, fizikNet2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(isim3, turkceNet3, matNet3, edebiyatNet3, fizikNet3);

                EsitAgirlik birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Birinci Eşit Ağırlık Öğrencisi : " + birinci.getIsim());
                System.out.println("Öğrencinin Puanı : " + birinci.puanHesapla());
            } else if (islem.equals("2")) {
                Sayisal ogrenci1 = new Sayisal(isim1, turkceNet1, matNet1, edebiyatNet1, fizikNet1);
                Sayisal ogrenci2 = new Sayisal(isim2, turkceNet2, matNet2, edebiyatNet2, fizikNet2);
                Sayisal ogrenci3 = new Sayisal(isim3, turkceNet3, matNet3, edebiyatNet3, fizikNet3);

                Sayisal birinci = birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Birinci Sayısal Öğrencisi : " + birinci.getIsim());
                System.out.println("Öğrencinin Puanı : " + birinci.puanHesapla());
            } else {
                System.out.println("Geçersiz İşlem.");
            }
        }
    }
}