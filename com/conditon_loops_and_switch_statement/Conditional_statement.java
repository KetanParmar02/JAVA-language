package com.conditon_loops_and_switch_statement;

import java.util.Scanner;

public class Conditional_statement {
    public static void main(String[] args) {
        /*
                     CONDITIONAL STATEMENT
                   ---------------------------
            -> here in JAVA there are three types of conditional statement
            1). if
            2). else-if
            3). else
         */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter The salary:- ");
        double salary = in.nextDouble();

        if (salary > 5000.000 && salary <= 15000.000){
            salary += 2000.000;
        } else if (salary > 15000.000) {
            salary += 3000.000;
        }else {
            salary += 1000.000;
        }
        System.out.println("The new salary= "+salary);

        // ternary operator
        /*
                syntax of ternary operator:-
             ->   statement ? true : false
         */
        System.out.println("Enter the number:- ");
        int n = in.nextInt();

        String ans = n % 2 == 0 ? "Even" : "Odd";
        System.out.println("The given number is "+ans);
    }
}
