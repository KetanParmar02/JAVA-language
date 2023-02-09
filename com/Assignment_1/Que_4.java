package com.Assignment_1;

import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {

        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number1= ");
        double num1 = in.nextDouble();

        System.out.print("Enter Number2= ");
        double num2 = in.nextDouble();

        System.out.print("Enter Any Mathematical operation symbol= ");
        char ch = in.next().trim().charAt(0);

        if (ch == '+'){
            System.out.println("The Sum of two number= "+(num1+num2));
        }
        if (ch == '-'){
            System.out.println("The Subtraction of two number= "+(num1-num2));
        }
        if (ch == '*'){
            System.out.println("The Multiplication of two number= "+(num1*num2));
        }
        if (ch == '/'){
            System.out.println("The Division of two number= "+(num1/num2));
        }
    }
}
