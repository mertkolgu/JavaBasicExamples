package com.javaexamples._33.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number1, number2;

        String[] islemler = {"1. Toplama işlemi", "2. Çıkarma İşlemi", "3. Çarpma İşlemi", "4. Bölme İşlemi"};
        for (String s : islemler)
            System.out.println(s);

        System.out.print("İşlem seçiniz : ");
        int islem = sc.nextInt();

        try {
            switch (islem) {
                case 1:
                    System.out.print("Birinci sayıyı giriniz : ");
                    number1 = sc.nextInt();
                    System.out.print("İkinci sayıyı giriniz : ");
                    number2 = sc.nextInt();

                    System.out.println("Toplam = " + (number1 + number2));
                    break;
                case 2:
                    System.out.print("Birinci sayıyı giriniz : ");
                    number1 = sc.nextInt();
                    System.out.print("İkinci sayıyı giriniz : ");
                    number2 = sc.nextInt();

                    System.out.println("Fark = " + (number1 - number2));
                    break;
                case 3:
                    System.out.print("Birinci sayıyı giriniz : ");
                    number1 = sc.nextInt();
                    System.out.print("İkinci sayıyı giriniz : ");
                    number2 = sc.nextInt();

                    if (number1 > 10000 && number2 > 10000) {
                        throw new CarpmaException();
                    }

                    System.out.println("Çarpım = " + (number1 * number2));
                    break;
                case 4:
                    System.out.print("Birinci sayıyı giriniz : ");
                    number1 = sc.nextInt();
                    System.out.print("İkinci sayıyı giriniz : ");
                    number2 = sc.nextInt();

                    System.out.println("Bölüm = " + (number1 / number2));
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız!");
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Bir sayı sıfıra bölünemez.");
        } catch (InputMismatchException e) {
            System.out.println("Lütfen doğru formatta sayı girin.");
        } catch (CarpmaException e) {
            e.printStackTrace();
        }
    }
}
