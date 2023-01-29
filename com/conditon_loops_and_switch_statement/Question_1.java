package com.conditon_loops_and_switch_statement;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        // Q-1) In three number which number bigger..

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number1:- ");
        int num1 = in.nextInt();
        System.out.print("Enter Number2:- ");
        int num2 = in.nextInt();
        System.out.print("Enter Number3:- ");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("The Bigger number is= "+num1);
        } else if (num2 > num3) {
            System.out.println("The Bigger number is= "+num2);
        }else {
            System.out.println("The Bigger number is= "+num3);
        }
    }
}
