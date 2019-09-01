package com.javaexamples._27.example;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HarflerinFrekansiniBulma {

    // TreeMap kullanarak bir String'in içindeki harflerin frekansını bulma

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> frekans = new TreeMap<>();

        System.out.print("Cümleyi giriniz : ");
        String cumle = sc.nextLine();

        for (int i = 0; i < cumle.length(); i++) {
            char c = cumle.charAt(i);

            if (frekans.containsKey(c)) {
                // key'e karşılık gelen value'yi artırır
                frekans.replace(c, frekans.get(c) + 1);
            } else {
                frekans.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : frekans.entrySet())
            System.out.println("Karakter : " + entry.getKey() + " " + entry.getValue() + " kadar geçiyor.");
    }
}