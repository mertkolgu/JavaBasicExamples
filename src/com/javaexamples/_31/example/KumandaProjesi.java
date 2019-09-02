package com.javaexamples._31.example;

import java.util.Scanner;

public class KumandaProjesi {

    public static void kanallariGoster(Kumanda kumanda) {
        if (kumanda.kanalSayisi() == 0) {
            System.out.println("Şuanda hiçbir kanal bulunmuyor...");
        } else {
            for (String kanal : kumanda)
                System.out.println("Kanal : " + kanal);
        }
    }

    public static void main(String[] args) {

        System.out.println("Kumanda Programına Hoşgeldiniz");
        Scanner sc = new Scanner(System.in);

        String[] islemler = {"İşlemler", "1 - Kanalları Göster", "2 - Kanal Ekle", "3 - Kanal Sil",
                "4 - Kanal Sayısı Öğren", "Çıkış : q"};

        for (String s : islemler)
            System.out.println(s);

        Kumanda kumanda = new Kumanda();

        while (true) {
            System.out.print("İşlemi seçiniz : ");
            String islem = sc.nextLine();

            if (islem.equalsIgnoreCase("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                kanallariGoster(kumanda);
            } else if (islem.equals("2")) {
                System.out.print("Eklenecek Kanal : ");
                String kanalIsmi = sc.nextLine();
                kumanda.kanalEkle(kanalIsmi);
            } else if (islem.equals("3")) {
                System.out.print("Silinecek Kanal : ");
                String kanalIsmi = sc.nextLine();
                kumanda.kanalSil(kanalIsmi);
            } else if (islem.equals("4")) {
                System.out.println("Kanal sayısı : " + kumanda.kanalSayisi());
            } else {
                System.out.println("Geçersiz İşlem...");
            }
        }
    }
}