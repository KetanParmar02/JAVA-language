package com.conditon_loops_and_switch_statement;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        // Q-2) Get Nth Fibonacci number

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Which Fibonacci Number you want:- ");
        int num = in.nextInt();

        int first = 0;
        int second = 1;
        int count = 2;

        while (count <= num){
            int temp = second;
            second += first;
            first = temp;
            count++;
        }
        System.out.println("Your Fibonacci Number is= "+second);
    }
}
