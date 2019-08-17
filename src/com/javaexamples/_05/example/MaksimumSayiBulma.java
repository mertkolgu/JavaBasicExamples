package com.javaexamples._05.example;

import java.util.Scanner;

public class MaksimumSayiBulma {

    // kullanıcıdan alınan 3 sayıdan en büyük sayıyı bulma

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = -1;

        System.out.print("Birinci sayıyı giriniz : ");
        int number1 = sc.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        int number2 = sc.nextInt();

        System.out.print("Üçüncü sayıyı giriniz : ");
        int number3 = sc.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            max = number1;

        } else if (number2 >= number1 && number2 >= number3) {
            max = number2;
        } else {
            max = number3;
        }

        System.out.println("En büyük sayı = " + max);
    }
}