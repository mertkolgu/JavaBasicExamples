package com.javaexamples._22.example;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class SehirTuru {

    public static void islemleriBastir() {
        String[] islemler = {"0 - İşlemleri Görüntüle", "1 - Bir Sonraki Şehre Git",
                "2 - Bir Önceki Şehre Git", "3 - Uygulamadan Çık"};
        for (String s : islemler)
            System.out.println(s);
    }

    public static void sehirleriTurla(List<String> sehirler) {
        ListIterator<String> iterator = sehirler.listIterator();
        Scanner sc = new Scanner(System.in);
        int islem;
        boolean cikis = false;
        boolean ileri = true;

        islemleriBastir();

        if (!iterator.hasNext()) {
            System.out.println("Herhangi bir şehir bulunmuyor.");
        }

        while (!cikis) {
            System.out.print("Bir işlem seçiniz : ");
            islem = sc.nextInt();

            switch (islem) {
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    if (!ileri) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        ileri = true;
                    }

                    if (iterator.hasNext()) {
                        System.out.println("Şehre gidiliyor : " + iterator.next());
                    } else {
                        System.out.println("Gidilecek şehir kalmadı.");
                        ileri = true;
                    }
                    break;
                case 2:
                    if (ileri) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        ileri = false;
                    }

                    if (iterator.hasPrevious()) {
                        System.out.println("Şehre gidiliyor : " + iterator.previous());
                    } else {
                        System.out.println("Şehir turu başladı.");
                    }
                    break;
                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor.");
                    break;
            }
        }
    }

    public static void main(String[] args) {

        List<String> sehirler = new LinkedList<>();
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Afyon");

        sehirleriTurla(sehirler);
    }
}