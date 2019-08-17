package com.javaexamples._11.example;

import java.util.Scanner;

public class KullaniciGirisi {

    // while döngüsü ile bir kullanıcı girişi yazma

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int girisHakki = 3;

        String sysKullaniciAdi = "mertkolgu";
        String sysParola = "1234";

        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");

        while (true) {
            System.out.print("Kullanıcı Adı : ");
            String kullanici = sc.nextLine();
            System.out.print("Parola : ");
            String parola = sc.nextLine();

            if (kullanici.equals(sysKullaniciAdi) && parola.equals(sysParola)) {
                System.out.println("Hoş geldiniz, " + kullanici);
                break;
            } else if (kullanici.equals(sysKullaniciAdi) && !parola.equals(sysParola)) {
                System.out.println("Parola Yanlış...");
                girisHakki--;
                System.out.println("Giriş Hakkı = " + girisHakki);
            } else if (!kullanici.equals(sysKullaniciAdi) && parola.equals(sysParola)) {
                System.out.println("Kullanıcı Adı Yanlış...");
                girisHakki--;
                System.out.println("Giriş Hakkı = " + girisHakki);
            } else {
                System.out.println("Kullanıcı Adınız ve Parolanız Yanlış");
                girisHakki--;
                System.out.println("Giriş Hakkı = " + girisHakki);
            }

            if (girisHakki == 0) {
                System.out.println("Giriş hakkınız bitti...");
                break;
            }
        }
    }
}