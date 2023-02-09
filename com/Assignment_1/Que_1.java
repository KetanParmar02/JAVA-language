package com.Assignment_1;

import java.util.Scanner;

public class Que_1 {
    public static void main(String[] args) {

        // Write a program to print whether a number is even or odd, also take input from the user.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number= ");
        int num = in.nextInt();

        if (num % 2 == 0){
            System.out.println("Given Number is even..");
        }else {
            System.out.println("Given Number is odd..");
        }
    }
}
