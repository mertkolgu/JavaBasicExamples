package com.javaexamples._17.example;

import java.util.Scanner;

public class IdmanProgrami {

    // idman programı

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("İdman Programına Hoşgeldiniz...");

        String[] idmanlar = {"Geçerli Hareketler", "Burpee", "Pushup(Şınav)", "Situp(Mekik)", "Squat"};
        for (String s : idmanlar)
            System.out.println(s);

        System.out.println("Bir idman oluşturun....");

        System.out.print("Burpee sayısı : ");
        int burpee = sc.nextInt();
        System.out.print("Pushup sayısı : ");
        int pushup = sc.nextInt();
        System.out.print("Situp sayısı : ");
        int situp = sc.nextInt();
        System.out.print("Squat sayısı : ");
        int squat = sc.nextInt();
        sc.nextLine();

        Idman idman = new Idman(burpee, pushup, situp, squat);

        System.out.println("İdmanınız başlıyor...");

        while (idman.idmanBittiMi() == false) {
            System.out.print("Hareket türü (Burpee, pushup, situp, squat) : ");
            String tur = sc.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız? : ");
            int sayi = sc.nextInt();
            sc.nextLine();
            idman.hareketYap(tur, sayi);
        }

        System.out.println("İdmanını başarıyla bitirdin...");
    }
}