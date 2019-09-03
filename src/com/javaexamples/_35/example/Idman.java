package com.javaexamples._35.example;

public class Idman {
    private int burpeeSayisi;
    private int pushupSayisi;
    private int situpSayisi;
    private int squatSayisi;

    public Idman(int burpeeSayisi, int pushupSayisi, int situpSayisi, int squatSayisi) {
        this.burpeeSayisi = burpeeSayisi;
        this.pushupSayisi = pushupSayisi;
        this.situpSayisi = situpSayisi;
        this.squatSayisi = squatSayisi;
    }

    public void hareketYap(String hareketTuru, int sayi) {

        if (hareketTuru.equalsIgnoreCase("Burpee")) {
            burpeeYap(sayi);
        } else if (hareketTuru.equalsIgnoreCase("Pushup")) {
            pushupYap(sayi);
        } else if (hareketTuru.equalsIgnoreCase("Situp")) {
            situpYap(sayi);
        } else if (hareketTuru.equalsIgnoreCase("Squat")) {
            squatYap(sayi);
        } else {
            System.out.println("Geçersiz hareket girdiniz...");
        }
    }

    public void burpeeYap(int sayi) {

        if (burpeeSayisi == 0) {
            System.out.println("Yapacak burpee kalmadı.");
        }
        if (burpeeSayisi - sayi < 0) {
            System.out.println("Hedeflediğin burpee sayısını geçtin. Tebrikler!");
            burpeeSayisi = 0;
            System.out.println("Kalan Burpee : " + burpeeSayisi);
        } else {
            burpeeSayisi -= sayi;
            System.out.println("Kalan Burpee Sayısı : " + burpeeSayisi);
        }
    }

    public void pushupYap(int sayi) {

        if (pushupSayisi == 0) {
            System.out.println("Yapacak pushup kalmadı.");
        }
        if (pushupSayisi - sayi < 0) {
            System.out.println("Hedeflediğin pushup sayısını geçtin. Tebrikler!");
            pushupSayisi = 0;
            System.out.println("Kalan Pushup : " + pushupSayisi);
        } else {
            pushupSayisi -= sayi;
            System.out.println("Kalan Pushup Sayısı : " + pushupSayisi);
        }
    }

    public void situpYap(int sayi) {

        if (situpSayisi == 0) {
            System.out.println("Yapacak situp kalmadı.");
        }
        if (situpSayisi - sayi < 0) {
            System.out.println("Hedeflediğin situp sayısını geçtin. Tebrikler!");
            situpSayisi = 0;
            System.out.println("Kalan Situp : " + situpSayisi);
        } else {
            situpSayisi -= sayi;
            System.out.println("Kalan Situp Sayısı : " + situpSayisi);
        }
    }

    public void squatYap(int sayi) {

        if (squatSayisi == 0) {
            System.out.println("Yapacak squat kalmadı.");
        }
        if (squatSayisi - sayi < 0) {
            System.out.println("Hedeflediğin squat sayısını geçtin. Tebrikler!");
            squatSayisi = 0;
            System.out.println("Kalan Squat : " + squatSayisi);
        } else {
            squatSayisi -= sayi;
            System.out.println("Kalan Squat Sayısı : " + squatSayisi);
        }
    }

    public boolean idmanBittiMi() {
        return ((burpeeSayisi == 0) && (pushupSayisi == 0) && (situpSayisi == 0) && (squatSayisi == 0));
    }

    public int getBurpeeSayisi() {
        return burpeeSayisi;
    }

    public void setBurpeeSayisi(int burpeeSayisi) {
        this.burpeeSayisi = burpeeSayisi;
    }

    public int getPushupSayisi() {
        return pushupSayisi;
    }

    public void setPushupSayisi(int pushupSayisi) {
        this.pushupSayisi = pushupSayisi;
    }

    public int getSitupSayisi() {
        return situpSayisi;
    }

    public void setSitupSayisi(int situpSayisi) {
        this.situpSayisi = situpSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }
}