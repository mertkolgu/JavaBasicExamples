package com.javaexamples._14.example;

import java.util.Scanner;

public class EbobBulma {

    // kullanıcıdan alınan 2 sayının EBOB'unu bulma

    public static int ebobBul(int sayi1, int sayi2) {
        int ebob = 1;

        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                ebob = i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        int sayi1 = sc.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int sayi2 = sc.nextInt();

        System.out.println("İki sayının EBOB'u = " + ebobBul(sayi1, sayi2));
    }
}