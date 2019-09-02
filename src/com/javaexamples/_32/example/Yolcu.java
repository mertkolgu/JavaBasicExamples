package com.javaexamples._32.example;

import java.util.Scanner;

public class Yolcu {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Yatırdığınız harç bedeli : ");
        this.harc = sc.nextInt();
        sc.nextLine();

        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu? (evet/hayır): ");
        String cevap = sc.nextLine();

        if (cevap.equalsIgnoreCase("evet")) {
            this.siyasiYasak = true;
        } else {
            this.siyasiYasak = false;
        }

        System.out.print("Vizeniz bulunuyor mu? (evet/hayır): ");
        String cevap2 = sc.nextLine();

        if (cevap2.equalsIgnoreCase("evet")) {
            this.vizeDurumu = true;
        } else {
            this.vizeDurumu = false;
        }
    }

    public void yurtDisiHarciKontrol() throws HarcException {
        if (this.harc < 15) {
            throw new HarcException();
        } else {
            System.out.println("Yurt dışı harcı işlemi tamamlandı.");

        }
    }

    public void siyasiYasakKontrol() throws SiyasiException {
        if (this.siyasiYasak == true) {
            throw new SiyasiException();
        } else {
            System.out.println("Siyasi yasağınız bulunmuyor");
        }
    }

    public void vizeDurumuKontrol() throws VizeException {
        if (this.vizeDurumu == true) {
            System.out.println("Vize işlemleri tamam.");
        } else {
            throw new VizeException();
        }
    }
}