package com.javaexamples._32.example;

public class VizeException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Gideceğiniz yere vizeniz bulunmamaktadır.");
    }
}