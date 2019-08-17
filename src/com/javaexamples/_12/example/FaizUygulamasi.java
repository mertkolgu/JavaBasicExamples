package com.javaexamples._12.example;

import java.util.Scanner;

public class FaizUygulamasi {

    // kullanıcıdan anapara değerini ve parasını kaç yıl vadeli yatırmak istediği
    // bilgilerini alın ve her sene sonunda toplam para miktarını ekrana yazdırın.
    // faiz oranı = %6

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int anaPara, vade;

        System.out.println("Bankamıza Hoşgeldiniz. Faiz oranı %6.");

        System.out.print("Anapara miktarını giriniz : ");
        anaPara = sc.nextInt();
        System.out.print("Paranızı kaç yıl vadeli yatırmak istiyorsunuz? : ");
        vade = sc.nextInt();

        double toplamPara = anaPara, faizOranı = 0.06;

        for (int i = 1; i <= vade; i++) {
            toplamPara = (toplamPara * faizOranı) + toplamPara;
            System.out.println(i + ". yılın sonunda toplam para : " + toplamPara);
        }
    }
}