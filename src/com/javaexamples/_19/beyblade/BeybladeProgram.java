package com.javaexamples._19.beyblade;

import java.util.Scanner;

public class BeybladeProgram {

    // beyblade program using polymorphism

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Beyblade Programına Hoşgeldiniz...");
        System.out.println("Çıkış için q'ya basınız...");

        while (true) {
            System.out.print("Hangi beyblade'i üretmek istiyorsunuz? : ");
            String islem = sc.nextLine();

            if (islem.equalsIgnoreCase("q")) {
                System.out.println("Programdan çıkılıyor.");
                break;
            } else {
                BeybladeFabrikasi beybladeFabrikasi = new BeybladeFabrikasi();
                Beyblade beyblade = beybladeFabrikasi.beybladeUret(islem);

                if (beyblade == null) {
                    System.out.println("Lütfen geçerli bir beyblade ismi girin.");
                } else {
                    beyblade.bilgileriGoster();
                    beyblade.saldiri();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}