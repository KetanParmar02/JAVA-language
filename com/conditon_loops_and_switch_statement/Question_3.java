package com.conditon_loops_and_switch_statement;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        // Q-3). Find Given Character is Capital OR Small.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Character:- ");
        char ch = in.next().trim().charAt(0);

        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("The Given Character is Capital");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The Given Character is Small");
        }else {
            System.out.println("The Given Character is not Capital OR Small.");
        }
    }
}
