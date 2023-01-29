package com.conditon_loops_and_switch_statement;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {

        // Q-5). Count particular digit in number

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number in which do you want to count digit: ");
        int num = in.nextInt();

        System.out.print("Enter digit which do you search in number: ");
        int n = in.nextInt();

        int count = 0;
        while (num > 0){
            int rem = num % 10;
            if (rem == n){
                count++;
            }
            num /= 10;
        }
        System.out.println("Your digit count= "+count);
    }
}
