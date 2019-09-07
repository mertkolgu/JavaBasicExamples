package com.javaexamples._40.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CopyMusic {
    // thread ile müzik kopyalama
    private static ArrayList<Integer> icerik = new ArrayList<>();

    public static void dosyaOku() {

        try {
            FileInputStream fis = new FileInputStream("folders/music.mp3");

            int oku;

            while ((oku = fis.read()) != -1) {
                icerik.add(oku);
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void kopyala(String dosyaIsmi) {

        try {
            FileOutputStream fos = new FileOutputStream("folders/" + dosyaIsmi);

            for (int deger : icerik)
                fos.write(deger);

        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        dosyaOku();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("music4.mp3");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("music5.mp3");
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("music6.mp3");
            }
        });

        long baslangic = System.currentTimeMillis();

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long bitis = System.currentTimeMillis();

        System.out.println("3 dosyanın kopyalanma süresi " + (bitis - baslangic) / 1000 + " saniye");
    }
}