package com.javaexamples._16.example;

import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        int girisHakki = 3;

        System.out.println("Bankamıza Hoşgeldiniz...");
        System.out.println("***************************");
        System.out.println("Kullanıcı Girişi");

        while (true) {
            if (login.login(hesap)) {
                System.out.println("Giriş başarılı...");
                break;
            } else {
                System.out.println("Giriş başarısız...");
                girisHakki--;
                System.out.println("Kalan giriş hakkı : " + girisHakki);
            }

            if (girisHakki == 0) {
                System.out.println("Giriş hakkınız bitti...");
                return;
            }
        }

        System.out.println("***************************");

        String[] islemler = {"1. Bakiye Görüntüleme", "2. Para Yatırma", "3. Para Çekme", "Çıkış için q'ya basınız."};
        for (String s : islemler)
            System.out.println(s);

        System.out.println("***************************");

        while (true) {
            System.out.print("İşlem Seçiniz : ");
            String islem = sc.nextLine();

            if (islem.equalsIgnoreCase("q")) {
                System.out.println("Çıkış Başarılı");
                return;
            } else if (islem.equals("1")) {
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            } else if (islem.equals("2")) {
                System.out.print("Yatırmak İstediğiniz Tutar : ");
                int tutar = sc.nextInt();
                sc.nextLine();
                hesap.paraYatir(tutar);
            } else if (islem.equals("3")) {
                System.out.print("Çekmek İstediğiniz Tutar : ");
                int tutar = sc.nextInt();
                sc.nextLine();
                hesap.paraCek(tutar);
            } else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}