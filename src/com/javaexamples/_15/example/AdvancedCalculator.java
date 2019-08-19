package com.javaexamples._15.example;

import java.util.Scanner;

public class AdvancedCalculator {

    // method overloading kullanarak bir tane hesap makinesi yapın.
    // toplama ve çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayın.

    public static int toplama(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int toplama(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

    public static int cikarma(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public static int carpma(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public static int carpma(int sayi1, int sayi2, int sayi3) {
        return sayi1 * sayi2 * sayi3;
    }

    public static double bolme(int sayi1, int sayi2) {
        return (double) sayi1 / sayi2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] islemler = {"1. Toplama İşlemi", "2. Çıkarma İşlemi", "3. Çarpma İşlemi", "4. Bölme İşlemi", "Çıkış için q'ya basın."};
        for (String s : islemler)
            System.out.println(s);

        while (true) {
            System.out.print("İşlem seçiniz : ");
            String islem = sc.nextLine();

            if (islem.equalsIgnoreCase("q")) {
                System.out.println("Programdan çıkılyor...");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Kaç değer toplayacaksınız? (2 veya 3) : ");
                int kacSayi = sc.nextInt();

                if (kacSayi == 2) {
                    System.out.print("Birinci sayıyı girin : ");
                    int sayi1 = sc.nextInt();
                    System.out.print("İkinci sayıyı girin : ");
                    int sayi2 = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Girilen sayıların toplamı = " + toplama(sayi1, sayi2));
                } else if (kacSayi == 3) {
                    System.out.print("Birinci sayıyı girin : ");
                    int sayi1 = sc.nextInt();
                    System.out.print("İkinci sayıyı girin : ");
                    int sayi2 = sc.nextInt();
                    System.out.print("Üçüncü sayıyı girin : ");
                    int sayi3 = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Girilen sayıların toplamı = " + toplama(sayi1, sayi2, sayi3));
                } else {
                    System.out.println("Bunun için uygun method bulunmuyor...");
                }
            } else if (islem.equals("2")) {
                System.out.print("Birinci sayıyı girin : ");
                int sayi1 = sc.nextInt();
                System.out.print("İkinci sayıyı girin : ");
                int sayi2 = sc.nextInt();
                sc.nextLine();

                System.out.println("Girilen sayıların farkı = " + cikarma(sayi1, sayi2));
            } else if (islem.equals("3")) {
                System.out.print("Kaç değer çarpacaksınız? (2 veya 3) : ");
                int kacSayi = sc.nextInt();

                if (kacSayi == 2) {
                    System.out.print("Birinci sayıyı girin : ");
                    int sayi1 = sc.nextInt();
                    System.out.print("İkinci sayıyı girin : ");
                    int sayi2 = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Girilen sayıların çarpımı = " + carpma(sayi1, sayi2));
                } else if (kacSayi == 3) {
                    System.out.print("Birinci sayıyı girin : ");
                    int sayi1 = sc.nextInt();
                    System.out.print("İkinci sayıyı girin : ");
                    int sayi2 = sc.nextInt();
                    System.out.print("Üçüncü sayıyı girin : ");
                    int sayi3 = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Girilen sayıların çarpımı = " + carpma(sayi1, sayi2, sayi3));
                } else {
                    System.out.println("Bunun için uygun method bulunmuyor...");
                }
            } else if (islem.equals("4")) {
                System.out.print("Birinci sayıyı girin : ");
                int sayi1 = sc.nextInt();
                System.out.print("İkinci sayıyı girin : ");
                int sayi2 = sc.nextInt();
                sc.nextLine();

                System.out.println("Girilen sayıların bölümü = " + bolme(sayi1, sayi2));
            } else {
                System.out.println("Geçersiz işlem seçtiniz...");
            }
        }
    }
}