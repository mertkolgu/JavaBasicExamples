package com.javaexamples._18.example;

import java.util.Scanner;

public class EmployeeProject {

    // çalışanlar programı
    // employee class'ı şeklinde super class
    // employee class'ından türeyen yazılımcı adında bir subclass
    // employee class'ından türeyen yönetici adından bir subclass

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Çalışanlar Programına Hoşgeldiniz...");
        System.out.println("*************************************");

        String[] islemler = {"İşlemler", "1. Yazılımcı İşlemleri", "2. Yönetici İşlemleri", "Çıkış için q'ya basın."};
        for (String s : islemler)
            System.out.println(s);

        System.out.println("*************************************");

        while (true) {
            System.out.print("İşlem Seçiniz : ");
            String islem = sc.nextLine();

            if (islem.equalsIgnoreCase("q")) {
                System.out.println("Programdan çıkılıyor...");
                return;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Mert", "Kolğu", 547, "Java, C");

                String[] yazilimciIslem = {"1. Format At", "2. Bilgileri Göster", "Çıkmak için q'ya basın."};
                for (String s : yazilimciIslem)
                    System.out.println(s);

                while (true) {
                    System.out.print("İşlem Seçiniz : ");
                    String yIslem = sc.nextLine();

                    if (yIslem.equalsIgnoreCase("q")) {
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    } else if (yIslem.equals("1")) {
                        System.out.print("İşletim Sistemi : ");
                        String isletimSistemi = sc.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                    } else if (yIslem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    } else {
                        System.out.println("Geçersiz Yazılımcı İşlemi...");
                    }
                }
            } else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Ecir", "Uğur", 547, 20);

                String[] yoneticiIslem = {"1. Zam Yap", "2. Bilgileri Göster", "Çıkmak için q'ya basın."};
                for (String s : yoneticiIslem)
                    System.out.println(s);

                while (true) {
                    System.out.print("İşlem Seçiniz : ");
                    String yIslem = sc.nextLine();

                    if (yIslem.equalsIgnoreCase("q")) {
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    } else if (yIslem.equals("1")) {
                        System.out.print("Yapılacak zam miktarı : ");
                        int zamMiktari = sc.nextInt();
                        sc.nextLine();
                        yonetici.zamYap(zamMiktari);
                    } else if (yIslem.equals("2")) {
                        yonetici.bilgileriGoster();
                    } else {
                        System.out.println("Geçersiz Yönetici İşlemi....");
                    }
                }
            } else {
                System.out.println("Geçersiz işlem girdiniz...");
            }
        }
    }
}