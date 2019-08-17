package com.javaexamples._09.example;

import java.util.Scanner;

public class ArmstrongSayi {

    // girilen sayının armstrong sayı olup olmadığını bulma
    // örneğin, 4 basamaklı bir sayının armstrong sayı olması için şu şartı sağlaması gerekir;
    // 1634 = 1^4 + 6^4 + 3^4 + 4^4 (buradaki 4 basamak sayısı)
    // 371 = 3^3 + 7^3 + 1^3 (buradaki 3 basamak sayısı)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Sayı giriniz : ");
        int sayi = sc.nextInt();

        System.out.print("Basamak sayısı : ");
        int basamak = sc.nextInt();

        int temp = sayi;

        do {
            int basamakDegeri = temp % 10;
            temp /= 10;
            toplam += Math.pow(basamakDegeri, basamak);
        } while (temp > 0);

        if (sayi == toplam) {
            System.out.println("Bu sayı bir armstrong sayıdır.");
        } else {
            System.out.println("Bu sayı bir armstrong sayı değildir.");
        }
    }
}