package com.conditon_loops_and_switch_statement;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {

        // Q-6). Given number is prime or not.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int num = in.nextInt();

        boolean ans = isPrime(num);
        System.out.println(ans);
    }
    static boolean isPrime(int num){
        int check = 2;

        if (num <= 2){
            return false;
        }

        while (check * check <= num){
            if (num % check == 0){
                return false;
            }
            check++;
        }
        return true;
    }
}
