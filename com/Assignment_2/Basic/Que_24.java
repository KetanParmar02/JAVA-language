package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_24 {
    public static void main(String[] args) {

        // Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner in = new Scanner(System.in);
        int num, largest_num=0;

        do {
            System.out.print("Enter number = ");
            num = in.nextInt();
            if (num > largest_num){
                largest_num = num;
            }
        }while (num != 0);

        System.out.println("The Largest number is = "+largest_num);
    }
}
