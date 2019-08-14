package com.javaexamples._03.example;

import java.util.Scanner;

public class SayiDegeriDegistirme {

    // kullanıcıdan alınan iki sayının değerlerini değiştirin.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number1, number2, temp;

        System.out.print("Birinci Sayı : ");
        number1 = sc.nextInt();

        System.out.print("İkinci Sayı : ");
        number2 = sc.nextInt();

        System.out.println("Değerler Değiştirilmeden Önce...");
        System.out.println("Birinci Sayı : " + number1 + "\nİkinci Sayı : " + number2);

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Değerler Değiştirildikten Sonra...");
        System.out.println("Birinci Sayı : " + number1 + "\nİkinci Sayı : " + number2);
    }
}