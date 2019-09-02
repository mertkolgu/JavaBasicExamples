package com.javaexamples._30.example;

import java.util.PriorityQueue;
import java.util.Queue;

public class AcilServisUygulamasi {

    // acil servis uygulaması
    // hastalar acil serviste şikayetlerine göre kuyrukta en önlere geçecek(PriorityQueue)
    // apandisit -> en yüksek öncelik
    // yanık -> orta öncelik
    // baş ağrısı -> en düşük öncelik

    public static void main(String[] args) {

        Queue<Hasta> acilServis = new PriorityQueue<>();

        acilServis.offer(new Hasta("Murat Bey", "Yanık"));
        acilServis.offer(new Hasta("Okan Bey", "Baş Ağrısı"));
        acilServis.offer(new Hasta("Elif Hanım", "Apandisit"));
        acilServis.offer(new Hasta("Oğuz Bey", "Yanık"));
        acilServis.offer(new Hasta("Merve Hanım", "Yanık"));
        acilServis.offer(new Hasta("Gizem Hanım", "Apandisit"));

        int i = 1;

        while (acilServis.isEmpty() != true) {
            System.out.println("**************************");
            System.out.println(i + ". sırada");
            System.out.println(acilServis.poll());
            System.out.println("**************************");
            i++;
        }
    }
}