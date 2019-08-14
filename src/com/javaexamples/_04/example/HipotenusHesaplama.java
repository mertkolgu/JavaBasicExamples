package com.javaexamples._04.example;

import java.util.Scanner;

public class HipotenusHesaplama {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Birinci kenarı giriniz : ");
        a = sc.nextInt();

        System.out.print("İkinci kenarı giriniz : ");
        b = sc.nextInt();

        double h = Math.sqrt((a * a) + (b * b));

        System.out.print("Hipotenüs Uzunluğu = " + h);
    }
}