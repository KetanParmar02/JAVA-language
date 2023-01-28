package com.conditon_loops_and_switch_statement;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
                        LOOPS
                    -------------
            -> here in the JAVA there are three types of loops
            1). for loop
            2). while loop
            3). do-while loop
         */

        /* for loop syntax:-

           for(initialization; condition; increment/decrement){
                // code
           }
        */

        // print 5 table using for loop
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number which you want to table:- ");
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println((num)+"*"+(i)+"="+(num)*(i));
        }

        System.out.println("*******************************************************************");

        /*
        while loop syntax:-

            while(condition){
                // code
            }
        */

        // print 7 table using while loop
        System.out.print("Enter number which you want to table:- ");
        int num1 = in.nextInt();

        int i = 1;
        while (i <= 10){
            System.out.println((num1)+"*"+(i)+"="+(num1)*(i));
            i++;
        }

        System.out.println("*******************************************************************");

        /*
        do-while loop syntax:-

            do{
                // code
            }while(condition);
        */

        // print 9 table using do-while loop
        System.out.print("Enter number which you want to table:- ");
        int num2 = in.nextInt();

        int j = 1;
        do {
            System.out.println((num2)+"*"+(j)+"="+(num2)*(j));
            j++;
        }while (j <= 10);
    }
}
