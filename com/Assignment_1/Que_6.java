package com.Assignment_1;

import java.util.Scanner;

public class Que_6 {
    public static void main(String[] args) {

        // Input currency in rupees and output in USD.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value= ");
        double value = in.nextDouble();

        System.out.println("The Indian Rupee = "+value);
        System.out.println("The USD Conversion from Indian Rupee= "+ (value*0.0121040)+"$");
    }
}
