package com.javaexamples._36.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotHesaplama {
    // dosyadan okuyarak not hesaplama

    public static String harfNotuHesapla(String isim, int vize1, int vize2, int finalNot) {
        String cikti = "";
        double toplamNot = (vize1 * 0.3) + (vize2 * 0.3) + (finalNot * 0.4);

        if (toplamNot >= 90) {
            cikti = isim + " bu dersten AA aldı...";
        } else if (toplamNot >= 85) {
            cikti = isim + " bu dersten BA aldı...";
        } else if (toplamNot >= 80) {
            cikti = isim + " bu dersten BB aldı...";
        } else if (toplamNot >= 75) {
            cikti = isim + " bu dersten CB aldı...";
        } else if (toplamNot >= 70) {
            cikti = isim + " bu dersten CC aldı...";
        } else if (toplamNot >= 65) {
            cikti = isim + " bu dersten DC aldı...";
        } else if (toplamNot >= 60) {
            cikti = isim + " bu dersten DD aldı...";
        } else if (toplamNot >= 55) {
            cikti = isim + " bu dersten FD aldı...";
        } else {
            cikti = isim + " bu dersten FF aldı...";
        }
        return cikti;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new FileReader("folders/dosya.txt"));
             FileWriter fileWriter = new FileWriter("folders/harfNotlari.txt")) {

            while (sc.hasNextLine()) {
                String ogrenciBilgileri = sc.nextLine();
                String[] ogrenciArray = ogrenciBilgileri.split(",");

                int vize1 = Integer.valueOf(ogrenciArray[1]);
                int vize2 = Integer.valueOf(ogrenciArray[2]);
                int finalNot = Integer.valueOf(ogrenciArray[3]);

                String cikti = harfNotuHesapla(ogrenciArray[0], vize1, vize2, finalNot);
                fileWriter.write(cikti + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}