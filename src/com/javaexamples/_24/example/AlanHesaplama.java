package com.javaexamples._24.example;

import java.util.Scanner;

public class AlanHesaplama {

    // geometrik şekillerin alanlarını hesaplama

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] islemler = {"İşlemler", "1 - Kare Alan Hesapla", "2 - Üçgen Alan Hesapla", "3 - Daire Alan Hesapla",
                "Çıkış için q'ya basın."};

        while (true) {
            for (String s : islemler)
                System.out.println(s);

            System.out.print("Hangi şeklin alanını hesaplamak istiyorsunuz : ");
            String sekilTuru = sc.nextLine();

            Sekil sekil = null;

            if (sekilTuru.equalsIgnoreCase("q")) {
                System.out.println("Programdan çıkılıyor.");
                break;
            } else if (sekilTuru.equals("1")) {
                System.out.print("Karenin kenarı : ");
                int kenar = sc.nextInt();
                sc.nextLine();

                sekil = new Kare("Kare", kenar);
                sekil.alanHesapla();
            } else if (sekilTuru.equals("2")) {
                System.out.print("Üçgenin birinci kenarı : ");
                int kenar1 = sc.nextInt();
                System.out.print("Üçgenin ikinci kenarı : ");
                int kenar2 = sc.nextInt();
                System.out.print("Üçgenin üçüncü kenarı : ");
                int kenar3 = sc.nextInt();
                sc.nextLine();

                sekil = new Ucgen("Üçgen", kenar1, kenar2, kenar3);
                sekil.alanHesapla();
            } else if (sekilTuru.equals("3")) {
                System.out.print("Dairenin yarıçapı : ");
                int yariCap = sc.nextInt();
                sc.nextLine();

                sekil = new Daire("Daire", yariCap);
                sekil.alanHesapla();
            } else {
                System.out.println("Geçersiz işlem.");
            }
        }
    }
}