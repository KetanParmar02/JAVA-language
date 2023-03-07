package com.Assignment_1;

import java.util.Scanner;

public class Que_9 {
    public static void main(String[] args) {

        // To find Armstrong Number between two given number.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Lower-Boundary number= ");
        int Lower_boundary = in.nextInt();

        System.out.print("Enter upper-Boundary number= ");
        int upper_boundary = in.nextInt();

        System.out.print("Armstrong number series= ");
        for(int number = Lower_boundary + 1; number < upper_boundary; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

            // number of digits calculation
            while (originalNumber > 0) {
                originalNumber /= 10;
                ++digits;
            }

            // here why i am assign originalNumber == number because in last digits count operation originalNumber is equal to the last digit of the number that's why i am reassign the number to the originalNumber..
            originalNumber = number;

            // result contains sum of nth power of its digits
            while (originalNumber > 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number) {
                System.out.print(number + " ");
            }
        }
    }
}
