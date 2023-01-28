package com.conditon_loops_and_switch_statement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("This Program is Calculator...");

        System.out.print("Enter any Mathematical singh for any operation:- ");
        char ch = in.next().trim().charAt(0);

        System.out.print("Enter num1: ");
        double num1 = in.nextDouble();
        System.out.print("Enter num2: ");
        double num2 = in.nextDouble();

        switch (ch) {
            case '+' -> System.out.println("The Sum of Two number is= " + (num1 + num2));
            case '-' -> System.out.println("The Subtraction of Two number is=" + (num1 - num2));
            case '*' -> System.out.println("The Multiplication of Two number is=" + (num1 * num2));
            case '/' -> System.out.println("The Division of Two number is=" + (num1 / num2));
            case '%' -> System.out.println("The Modulo of Two number is=" + (num1 % num2));
            case '^' -> System.out.println("The Power of the number is=" + (Math.pow(num1, num2)));
            default -> System.out.println("Enter valid Mathematical singh....");
        }

    }
}
