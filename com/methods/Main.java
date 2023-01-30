package com.methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println("The sum of two number is= "+ans);
    }
    /*
            syntax of methods:-
         --------------------------
         return_type name(){
                // body
                return statement;
         }
     */
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1:- ");
        int num1 = in.nextInt();
        System.out.print("Enter num2:- ");
        int num2 = in.nextInt();

        int ans = num1+num2;
        System.out.println("The sum of two number is= "+ans);
    }

    // return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1:- ");
        int num1 = in.nextInt();
        System.out.print("Enter num2:- ");
        int num2 = in.nextInt();
        return num1+num2;
    }
}
