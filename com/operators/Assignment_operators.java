package com.operators;

import java.util.Scanner;

public class Assignment_operators {
    public static void main(String[] args) {

        /*            ASSIGNMENT OPERATORS
                --------------------------------

               1). LESS THAN -> <
               2). GREATER THAN -> >
               3). LESS THAN OR EQUAL TO -> <=
               4). GREATER THAN OR EQUAL TO -> >=
               5). EQUAL TO -> ==
               6). NOT EQUAL TO -> !=
        */
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER NUMBER1:- ");
        int num1 = in.nextInt();
        System.out.print("ENTER NUMBER2:- ");
        int num2 = in.nextInt();

        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 == num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 != num2);
    }
}
