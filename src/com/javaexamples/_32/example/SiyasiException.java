package com.javaexamples._32.example;

public class SiyasiException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasağınız bulunuyor.");
    }
}