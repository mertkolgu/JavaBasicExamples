package com.javaexamples._01.example;

import java.util.Scanner;

public class BodyMassIndex {

    // vücut kitle indeksi hesaplama
    // VKİ = kilo / boy(m) * boy(m)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz : ");
        int weight = sc.nextInt();

        System.out.print("Boyunuzu giriniz (Örnek : 1.83) : ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Beden Kitle İndeksiniz : " + bmi);

        if (bmi < 18.49)
            System.out.println("İdeal kilonuzun altındasınız! - ZAYIF");
        else if (bmi > 18.5 && bmi < 24.99)
            System.out.println("İdeal kilonuzdasınız! - NORMAL");
        else if (bmi > 25 && bmi < 29.99)
            System.out.println("İdeal kilonuzun üzerindesiniz! - HAFİF KİLOLU");
        else
            System.out.println("ideal kilonuzun çok üzerindesiniz!! - OBEZ");
    }
}