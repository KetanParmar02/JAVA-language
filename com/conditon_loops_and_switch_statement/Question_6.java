package com.conditon_loops_and_switch_statement;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {

        // Q-6). Given number is prime or not.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int num = in.nextInt();
        int check = 2;

        while (check*check <= num){
            if (num % 2 == 0){
                System.out.println("Not Prime..!");
                break;
            }
            check++;
            if (num % 2 != 0){
                System.out.println("Prime..!");
            }
        }
    }
}
