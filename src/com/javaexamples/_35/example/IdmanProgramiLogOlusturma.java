package com.javaexamples._35.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IdmanProgramiLogOlusturma {

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

        int i = 1;
        try (FileWriter fileWriter = new FileWriter("folders/idmanLog.txt")) {

            fileWriter.write("İdman Programı\n");
            fileWriter.write("Burpee Sayısı : " + idman.getBurpeeSayisi() + " \n");
            fileWriter.write("Pushup Sayısı : " + idman.getPushupSayisi() + " \n");
            fileWriter.write("Situp Sayısı : " + idman.getSitupSayisi() + " \n");
            fileWriter.write("Squat Sayısı : " + idman.getSquatSayisi() + " \n");

            while (idman.idmanBittiMi() == false) {
                System.out.print("Hareket türü (Burpee, pushup, situp, squat) : ");
                String tur = sc.nextLine();
                System.out.print("Bu hareketten kaç tane yapacaksınız? : ");
                int sayi = sc.nextInt();
                sc.nextLine();
                idman.hareketYap(tur, sayi);

                fileWriter.write(i + ". işlem ---> Hareket : " + tur + " ---> Sayı : " + sayi + "\n");
                i++;
            }

            System.out.println("İdmanını başarıyla bitirdin...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}