package com.conditon_loops_and_switch_statement;

import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your fruit choice:- ");
        String fruit = in.next().trim();

        // simple switch statement..

        switch (fruit){
            case "Apple":
                System.out.println("It is Red fruit");
                break;

            case "Grapes":
                System.out.println("It is small Green/Black fruit");
                break;

            case "Banana":
                System.out.println("It is big yellow fruit");
                break;

            case "Orange":
                System.out.println("It is big saffron fruit");
                break;

            case "Pinepal":
                System.out.println("It is Big fruit");
                break;

            default:
                System.out.println("Enter invalid choice...");
        }

        // enhanced switch statement.

        switch (fruit) {
            case "Apple" -> System.out.println("It is Red fruit");
            case "Grapes" -> System.out.println("It is small Green/Black fruit");
            case "Banana" -> System.out.println("It is big yellow fruit");
            case "Orange" -> System.out.println("It is big saffron fruit");
            case "Pinepal" -> System.out.println("It is Big fruit");
            default -> System.out.println("Enter invalid choice...");
        }
    }
}
