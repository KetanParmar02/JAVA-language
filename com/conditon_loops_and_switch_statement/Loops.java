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

        System.out.print("Enter Number = ");
        int n1 = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println((n1)+" * "+(i)+" = "+(n1)*(i));
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

        System.out.print("Enter number = ");
        int n2 = in.nextInt();

        int i2 = 1;
        while (i2 <= 10){
            System.out.println((n2) + " * " +(i2)+" = "+(n2)*(i2));
            i2++;
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

        System.out.println("*******************************************************************");

        System.out.print("Enter number = ");
        int n3 = in.nextInt();

        int i3 = 1;
        do {
            System.out.println((n3)+" * "+(i3) + " = " + (n3)*(i3));
            i3++;
        }while (i3 <= 10);
    }
}
