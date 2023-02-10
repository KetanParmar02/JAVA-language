package com.Assignment_1;

import java.util.Scanner;

public class Que_7 {
    public static void main(String[] args) {

        // To calculate Fibonacci Series up to n numbers.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number= ");
        int num = in.nextInt();

        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2);
        for (int i = 2; i < num; i++) {
            int n3 = n1+n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
