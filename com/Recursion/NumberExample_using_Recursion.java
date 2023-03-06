package com.Recursion;

public class NumberExample_using_Recursion {
    public static void main(String[] args) {
        // print the number from 1,2,3,4,5
        Recursion(1);
    }
    static void Recursion(int n){
        if (n == 5){
            System.out.println(5);
            return;
        }

        System.out.println(n);
        Recursion(n+1);
    }
}
