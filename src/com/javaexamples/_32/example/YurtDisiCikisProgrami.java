package com.javaexamples._32.example;

public class YurtDisiCikisProgrami {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gökçen Havalimanına Hoş Geldiniz...");
        String[] sartlar = {"Yurtdışı Çıkış Kuralları", "Herhangi bir siyasi yasağınızın bulunmaması gerekiyor.",
                "15 TL harç bedelinizi tam olarak yatırmanız gerekiyor.", "Gideceğiniz ülkeye vizenizin bulunması gerekiyor."};

        while (true) {
            System.out.println("******************************************************");
            for (String s : sartlar)
                System.out.println(s);
            System.out.println("******************************************************");

            Yolcu yolcu = new Yolcu();

            System.out.println("Harç bedeli kontrol ediliyor.");
            Thread.sleep(3000);

            try {
                yolcu.yurtDisiHarciKontrol();
            } catch (HarcException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor.");
            Thread.sleep(3000);

            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor.");
            Thread.sleep(3000);

            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("İşlemleriniz tamamlandı. Yurtdışına çıkabilirsiniz.");
            break;
        }
    }
}
