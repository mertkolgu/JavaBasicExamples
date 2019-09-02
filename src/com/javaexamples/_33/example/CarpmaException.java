package com.javaexamples._33.example;

public class CarpmaException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("İki sayı da çok büyük. Lütfen daha küçük sayılar girin.");
    }
}