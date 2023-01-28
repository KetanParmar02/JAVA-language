package com.conditon_loops_and_switch_statement;

import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter empID:- ");
        int empID = in.nextInt();

        System.out.print("Enter department:- ");
        String str = in.next();

        switch (empID){
            case 1:
                System.out.println("Ketan");
                break;

            case 2:
                System.out.println("Kelvin");
                break;

            case 3:
                switch (str) {
                    case "IT" -> System.out.println("IT department...");
                    case "Computer" -> System.out.println("Computer department..");
                    default -> System.out.println("Enter valid department..");
                }
                break;

            default:
                System.out.println("Enter valid ID..");
        }
    }
}
