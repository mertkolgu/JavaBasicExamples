package com.javaexamples._25.example;

import java.util.Scanner;

public class BasicMathPysicProblems {

    // Basit matematik ve fizik problemleri
    // matematik - daire alan ve üçgen çevresi
    // fizik - üç boyutlu vektörlerin iç çarpımı

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Matematik ve Fizik Problemleri Programına Hoşgeldiniz...");

        String[] islemler = {"İşlemler...", "1 - Daire Alanı Hesaplama", "2 - Üçgen Çevresi Hesaplama",
                "3 - İki Vektörün İç Çarpımını Hesaplama", "Çıkış : q"};

        while (true) {
            for (String s : islemler)
                System.out.println(s);

            System.out.print("İşlemi seçiniz : ");
            String islem = sc.nextLine();

            if (islem.equalsIgnoreCase("q")) {
                System.out.println("Programdan Çıkılıyor.");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Dairenin Yarıçapı : ");
                int yariCap = sc.nextInt();
                sc.nextLine();

                Problem.Mathematic.daireAlan(yariCap);
            } else if (islem.equals("2")) {
                System.out.print("Birinci kenarı giriniz : ");
                int kenar1 = sc.nextInt();
                System.out.print("İkinci kenarı giriniz : ");
                int kenar2 = sc.nextInt();
                System.out.print("Üçüncü kenarı giriniz : ");
                int kenar3 = sc.nextInt();
                sc.nextLine();

                Problem.Mathematic.ucgenCevresi(kenar1, kenar2, kenar3);
            } else if (islem.equals("3")) {
                Vec vector1 = new Vec("Vektör1");
                Vec vector2 = new Vec("Vektör2");

                Problem.Physic.icCarpim(vector1, vector2);
            } else {
                System.out.println("Geçersiz işlem girdiniz.");
            }
        }
    }
}