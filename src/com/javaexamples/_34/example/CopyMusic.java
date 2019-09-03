package com.javaexamples._34.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class CopyMusic {
    // müzik kopyalama
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
        long baslangic = System.currentTimeMillis();

        kopyala("music1.mp3");
        kopyala("music2.mp3");
        kopyala("music3.mp3");

        long bitis = System.currentTimeMillis();

        System.out.println("3 dosyanın kopyalanma süresi " + (bitis - baslangic) / 1000 + " saniye");
    }
}