package com.javaexamples._16.example;

public class ATMProgramOOP {

    // OOP ATM Program
    // login class'ı kullanıcı girişini kontrol edecek
    // hesap class'ı hesap işlemlerini yapacak
    // ATM ise ATM'yi çalıştıracak

    public static void main(String[] args) {

        ATM atm = new ATM();
        Hesap hesap = new Hesap("mertkolgu", "12345", 2000);

        atm.calis(hesap);

        System.out.println("Programdan çıkılıyor...");
    }
}