package com.javaexamples._07.example;

import java.util.Scanner;

public class NotHesaplama {

    // kullanıcıdan 2 vize ve 1 final notu alarak harf hesaplama sistemi yapın.
    // ayrıca kullanıcıdan okuldaki GNO alarak, DD alma ve 2.50'nin altında olma
    // koşuluna göre ekrana bir tavsiye mesajı yazdırın.

    // her vize toplam notun %30'una
    // final ise toplam notun %40'ına etki edecek.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci vize notunuz : ");
        int vize1 = sc.nextInt();

        System.out.print("İkinci vize notunuz : ");
        int vize2 = sc.nextInt();

        System.out.print("Final notunuz : ");
        int fin = sc.nextInt();

        System.out.print("Okul GNO : ");
        double ortalama = sc.nextDouble();

        double dersOrtalamasi = (vize1 * 0.3) + (vize2 * 0.3) + (fin * 0.4);
        System.out.println("Ders Ortalamanız : " + dersOrtalamasi);

        if (dersOrtalamasi >= 88) {
            System.out.println("AA aldınız.");
        } else if (dersOrtalamasi >= 78 && dersOrtalamasi <= 87) {
            System.out.println("BA aldınız.");
        } else if (dersOrtalamasi >= 72 && dersOrtalamasi <= 77) {
            System.out.println("BB aldınız.");
        } else if (dersOrtalamasi >= 68 && dersOrtalamasi <= 71) {
            System.out.println("CB aldınız.");
        } else if (dersOrtalamasi >= 60 && dersOrtalamasi <= 67) {
            System.out.println("CC aldınız.");
        } else if (dersOrtalamasi >= 52 && dersOrtalamasi <= 59) {
            System.out.println("DC aldınız.");

            if (ortalama < 2.50) {
                System.out.println("DC aldınız ve GNO 2.50'den düşük dersi tekrar alabilirsiniz.");
            }
        } else if (dersOrtalamasi >= 46 && dersOrtalamasi <= 51) {
            System.out.println("DD aldınız.");

            if (ortalama < 2.50) {
                System.out.println("DD aldınız ve GNO 2.50'den düşük dersi tekrar alabilirsiniz.");
            }
        } else if (dersOrtalamasi >= 35 && dersOrtalamasi <= 46) {
            System.out.println("FD aldınız. Dersten kaldınız.");
        } else {
            System.out.println("FF aldınız. Dersten kaldınız.");
        }
    }
}