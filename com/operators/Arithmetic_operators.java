package com.operators;

import java.util.Scanner;

public class Arithmetic_operators {
    public static void main(String[] args) {
         /*
                        ARITHMETIC OPERATOR
                  ---------------------------------

             1). addition -> +
             2). subtraction -> -
             3). multiplication -> *
             4). division -> /
             5). modulo -> %
         */

        Scanner in = new Scanner(System.in);
        System.out.print("ENTER NUMBER1:- ");
        int num1 = in.nextInt();
        System.out.print("ENTER NUMBER2:- ");
        int num2 = in.nextInt();

        int ans = num1+num2;
        int ans1 = num1-num2;
        int ans2 = num1*num2;
        int ans3 = num1/num2;
        int ans4 = num1%num2;
        int result = num1++;

        System.out.println("The sum of two numbers= "+ans);
        System.out.println("The subtraction of two numbers= "+ans1);
        System.out.println("The multiplication of two numbers= "+ans2);
        System.out.println("The division of two numbers= "+ans3);
        System.out.println("The modulo of two numbers= "+ans4);
        System.out.println(result);
        System.out.println(num1);
        System.out.println(++num1);
    }
}
