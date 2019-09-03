package com.javaexamples._37.example;

import java.io.*;

public class OyunKayit {

    public static void oyunuKaydet(Kart[][] kartlar) {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("folders/kayit.bin"))) {
            System.out.println("Oyun Kaydediliyor...");
            outputStream.writeObject(kartlar);
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        }
    }

    public static Kart[][] kayittanAl() {

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("folders/kayit.bin"))) {

            Kart[][] cikti = (Kart[][]) inputStream.readObject();
            return cikti;
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu.");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı.");
        }
        return null;
    }
}