package com.javaexamples._02.example;

import java.util.Scanner;

public class AracYakitBilgisi {

    // Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı bilgilerini alın
    // ve sürücünün toplam ne kadar ödemesini gerektiğini hesaplayın.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Aracınız kilometrede kaç kuruş yakıyor? (Örnek : 0.32) : ");
        double kurus = sc.nextDouble();

        System.out.print("Aracınız ile kaç kilometre gittiniz? : ");
        int km = sc.nextInt();

        System.out.print("Toplam ödemeniz gereken tutar : " + (kurus * km) + " TL'dir.");
    }
}