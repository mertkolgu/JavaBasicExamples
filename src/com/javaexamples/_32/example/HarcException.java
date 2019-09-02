package com.javaexamples._32.example;

public class HarcException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Lütfen yurtdışı harcını tam yatırın.");
    }
}