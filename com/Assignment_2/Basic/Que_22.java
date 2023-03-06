package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_22 {
    public static void main(String[] args) {

        // Input a number and print all the factors of that number (use loops).
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int num = in.nextInt();

        System.out.print("The Factor of "+num+" is = ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
