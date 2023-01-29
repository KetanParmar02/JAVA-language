package com.conditon_loops_and_switch_statement;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {

        // Q-4). Reverse the given number

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        long num = in.nextLong();

        long ans = 0;
        while (num > 0){
            long rem = num % 10;
            ans = ans*10+rem;
            num /= 10;
        }
        System.out.println("The Reverse number is= "+ans);
    }
}
