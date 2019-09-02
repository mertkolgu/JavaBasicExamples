package com.javaexamples._28.example;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeBulma {

    // bir cümlenin palindrome olup olmadığını stack ile bulma
    // palindrome; baştan okunuşu ile tersten okunuşu aynı olan cümledir
    // kasaylabalyasak

    public static boolean isPolindrome(String cumle, Stack<Character> stack) {
        for (int i = (cumle.length() / 2) + 1; i < cumle.length(); i++) {
            if (cumle.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Cümle giriniz : ");
        String cumle = sc.nextLine();

        for (int i = 0; i < cumle.length() / 2; i++) {
            stack.push(cumle.charAt(i));
        }

        if (isPolindrome(cumle, stack)) {
            System.out.println("Bu cümle palindrome cümledir.");
        } else {
            System.out.println("Bu cümle palindrome değildir.");
        }
    }
}