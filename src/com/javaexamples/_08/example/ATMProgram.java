package com.javaexamples._08.example;

import java.util.Scanner;

public class ATMProgram {

    // while döngüsü ile ATM programı
    // İşlemler
    // 1. İşlem : Bakiye öğrenme
    // 2. İşlem : Para çekme
    // 3. İşlem : Para yatırma
    // Çıkış : q

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int bakiye = 1000;
        String[] islemler = {"1. Bakiye Öğrenme", "2. Para Çekme", "3. Para Yatırma", "Çıkış İçin q'ya basın."};

        for (String s : islemler)
            System.out.println(s);

        System.out.println("**********************");

        while (true) {
            System.out.print("İşlemi Seçiniz : ");
            String islem = sc.nextLine();

            if (islem.equalsIgnoreCase("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + bakiye);
            } else if (islem.equals("2")) {
                System.out.print("Çekmek istediğiniz tutar : ");
                int tutar = sc.nextInt();
                sc.nextLine();  // nextInt'ten sonraki satırı almasın diye nextLine attık

                if (bakiye - tutar < 0) {
                    System.out.println("Yeterli tutar yok. Bakiyeniz : " + bakiye);
                } else {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz : " + bakiye);
                }

            } else if (islem.equals("3")) {
                System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar = sc.nextInt();
                sc.nextLine();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz : " + bakiye);
            } else {
                System.out.println("Geçersiz işlem!");
            }
        }
    }
}