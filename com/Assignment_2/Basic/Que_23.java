package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_23 {
    public static void main(String[] args) {

        // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;

        do {
            System.out.print("Enter Number = ");
            num = in.nextInt();

            if (num == 0){
                System.out.println("The sum of all number is = "+sum);
                break;
            }
            sum += num;
            System.out.println("The sum of all number is = "+sum);
        }while (num > 0);

    }
}
