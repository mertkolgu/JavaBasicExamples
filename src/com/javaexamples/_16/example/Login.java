package com.javaexamples._16.example;

import java.util.Scanner;

public class Login {

    public boolean login(Hesap hesap) {
        Scanner sc = new Scanner(System.in);
        String kullaniciAdi;
        String parola;

        System.out.print("Kullanıcı Adı : ");
        kullaniciAdi = sc.nextLine();
        System.out.print("Parola : ");
        parola = sc.nextLine();

        if (hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola)) {
            return true;
        } else {
            return false;
        }
    }
}