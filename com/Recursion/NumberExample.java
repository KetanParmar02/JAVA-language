package com.Recursion;

public class NumberExample {
    public static void main(String[] args) {
        // print the number from 1 to 5
        number(1);
    }
    static void number(int n){
        System.out.println(n);
        number1(2);
    }

    static void number1(int n) {
        System.out.println(n);
        number2(3);
    }

    static void number2(int i) {
        System.out.println(i);
        number3(4);
    }

    static void number3(int i) {
        System.out.println(i);
        number4(5);
    }

    static void number4(int i) {
        System.out.println(i);
    }
}
