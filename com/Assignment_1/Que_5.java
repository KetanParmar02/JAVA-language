package com.Assignment_1;

import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) {

        // Take 2 numbers as input and print the largest number.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number1= ");
        double num1 = in.nextDouble();

        System.out.print("Enter Number2= ");
        double num2 = in.nextDouble();

        if (num1 > num2){
            System.out.println(num1+" is Greatest number..");
        }else {
            System.out.println(num2+" is Greatest Number..");
        }
    }
}
