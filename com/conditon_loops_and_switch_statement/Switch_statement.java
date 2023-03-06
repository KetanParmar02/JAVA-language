package com.conditon_loops_and_switch_statement;

import java.util.Locale;
import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your fruit choice:- ");
        String fruit = in.next().trim();

        // simple switch statement..

//        switch (fruit){
//            case "Apple":
//                System.out.println("It is Red fruit");
//                break;
//
//            case "Grapes":
//                System.out.println("It is small Green/Black fruit");
//                break;
//
//            case "Banana":
//                System.out.println("It is big yellow fruit");
//                break;
//
//            case "Orange":
//                System.out.println("It is big saffron fruit");
//                break;
//
//            case "Pinepal":
//                System.out.println("It is Big fruit");
//                break;
//
//            default:
//                System.out.println("Enter invalid choice...");
//        }

        // enhanced switch statement.

        switch (fruit) {
            case "Apple" -> System.out.println("It is Red fruit");
            case "Grapes" -> System.out.println("It is small Green/Black fruit");
            case "Banana" -> System.out.println("It is big yellow fruit");
            case "Orange" -> System.out.println("It is big saffron fruit");
            case "Pinepal" -> System.out.println("It is Big fruit");
            default -> System.out.println("Enter invalid choice...");
        }

        System.out.println("*********************************************");

        System.out.print("Enter vegetable Name = ");
        String V_name = in.next().trim();

        switch (V_name) {
            case "Cabbage" -> System.out.println("It green or pink vegetable..");
            case "Brinjal" -> System.out.println("It is dark purple color vegetable..");
            case "Tomato" -> System.out.println("It is red color vegetable..");
            case "Onion" -> System.out.println("It is raddis-pink color vegetable..");
            case "Gralic" -> System.out.println("It is white color small vegetable..");
            case "Corn" -> System.out.println("It is yellow color very small vegetable..");
            case "Carrot" -> System.out.println("It is orange color vegetable..");
            default -> System.out.println("Enter valid vegetable name...!");
        }
    }
}
