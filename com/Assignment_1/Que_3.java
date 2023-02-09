package com.Assignment_1;

import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {

        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal Amount= ");
        double principal_amount = in.nextDouble();

        System.out.print("Enter Time in Year= ");
        double time = in.nextDouble();

        System.out.print("Enter Rate in percentage(%)= ");
        double rate = in.nextDouble();

        double total_amount = principal_amount + (principal_amount*rate*time)/100;

        System.out.println("The Interest Amount= "+(principal_amount*rate*time)/100);
        System.out.println("Total Payable Amount = "+total_amount);
    }
}
