package com.javaexamples._29.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PideKuyrugu {

    // ramazan pidesi uygulaması
    // fırından 1(dahil) ile 10(dahil) arasında pide çıkacak.
    // kuyruktakiler pideyi almaya çalışacak

    public static void main(String[] args) throws InterruptedException {

        System.out.println("---Ramazan Pidesi Uygulaması---");

        Queue<String> pideKuyrugu = new LinkedList<>();
        Random rnd = new Random();

        pideKuyrugu.offer("Murat");
        pideKuyrugu.offer("Hasan");
        pideKuyrugu.offer("Okan");
        pideKuyrugu.offer("Ayşe");
        pideKuyrugu.offer("Merve");
        pideKuyrugu.offer("Ezgi");
        pideKuyrugu.offer("Gizem");
        pideKuyrugu.offer("Mehmet");
        pideKuyrugu.offer("Oğuz");
        pideKuyrugu.offer("Azer");

        // 0-9 arası değer üretir (+1 ekleyip 1-10 arası değer ürettik)
        int pideSayisi = 1 + rnd.nextInt(10);

        System.out.println("Pideler Çıkıyor...");
        System.out.println("Çıkan Pide Sayısı : " + pideSayisi);

        Thread.sleep(3000);

        while (pideSayisi != 0) {
            System.out.println(pideKuyrugu.poll() + " pideyi aldı...");
            pideSayisi--;
            Thread.sleep(1000);
        }

        System.out.println("Pide Kalmadı...");
    }
}