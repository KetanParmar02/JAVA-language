package com.methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();

        int ans = sum2();
        System.out.println("The sum of two number is= "+ans);

        int ans1 = sum3(23,467);
        System.out.println("The sum of two number is= "+ans1);
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

    // pass the argument in the function
    static int sum3(int a, int b){
        return a+b;
    }
}
