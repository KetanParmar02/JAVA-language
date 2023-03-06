package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_24 {
    public static void main(String[] args) {

        //
        Scanner sc = new Scanner(System.in);
////        int num, largest_num=0;
////        System.out.print("ENTER A NUMBER: ");
////        num = sc.nextInt();
//
//        // Condition Starts
//        while(num!=0){
//            System.out.print("ENTER A NUMBER: ");
//            num = sc.nextInt();
//            System.out.println("ENTER 0 TO END LOOP");
//            if(num>largest_num){
//                largest_num = num; // The value of largest_num will change to the value of num
//            }
//        }// Condition Ends
//        System.out.print("The largest number entered by the user is: "+largest_num);

        int num, largest_num=0;

        do {
            System.out.print("Enter number = ");
            num = sc.nextInt();
            if (num > largest_num){
                largest_num = num;
            }
        }while (num != 0);

        System.out.println("The Largest number is = "+largest_num);
    }
}
