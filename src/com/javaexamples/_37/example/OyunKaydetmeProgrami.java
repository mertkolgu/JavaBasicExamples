package com.javaexamples._37.example;

import java.io.File;
import java.util.Scanner;

public class OyunKaydetmeProgrami {

    // hafıza oyunu kaydetme
    private static Kart[][] kartlar = new Kart[4][4];

    public static void oyunTahtasi() {
        System.out.println("____________");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin()) {
                    System.out.print("{" + kartlar[i][j].getDeger() + "}");
                } else {
                    System.out.print("{ }");
                }
            }
            System.out.println();
            System.out.println("____________");
        }

    }

    public static boolean oyunBittiMi() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin() == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void tahminEt() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci Tahmin : ");
        int i1 = sc.nextInt();
        int j1 = sc.nextInt();

        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();

        System.out.print("İkinci Tahmin : ");
        int i2 = sc.nextInt();
        int j2 = sc.nextInt();

        if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()) {
            System.out.println("Doğru Tahmin.");
            kartlar[i2][j2].setTahmin(true);
        } else {
            System.out.println("Yanlış Tahmin.");
            kartlar[i1][j1].setTahmin(false);
        }
    }

    public static void kayittanAl() {
        Scanner sc = new Scanner(System.in);
        File file = new File("folders/kayit.bin");

        if (file.exists()) {
            System.out.println("Kaydedilmiş bir oyununuz var.");
            System.out.print("Kayıttan devam etmek ister misiniz? (yes ya da no) : ");
            String cevap = sc.nextLine();

            if (cevap.equalsIgnoreCase("yes")) {
                kartlar = OyunKayit.kayittanAl();
                return;
            }
        }

        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        kayittanAl();

        while (oyunBittiMi() == false) {
            oyunTahtasi();

            System.out.print("Çıkmak istiyor musunuz? (yes ya da no) : ");
            String cikis = sc.nextLine();

            if (cikis.equalsIgnoreCase("yes")) {
                System.out.print("Oyunu kaydetmek istiyor musunuz? (yes ya da no) : ");
                String kayit = sc.nextLine();

                if (kayit.equalsIgnoreCase("yes")) {
                    OyunKayit.oyunuKaydet(kartlar);
                } else {
                    System.out.println("Oyun kaydedilmedi.");
                }
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            tahminEt();
        }
    }
}