package com.methods;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number= ");
        int num = in.nextInt();

        boolean ans = isArmstrong1(num);
        System.out.println(ans);

        // here String.valueOf(num).length() -> this will return the how many digit in the number
        // here number is converting integer to string
        System.out.println(String.valueOf(num).length());

        System.out.print("The 100 to 1000 between total Armstrong number= ");
        for (int i = 100; i < 10000; i++) {
            if (isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }

    static boolean isArmstrong(int num) {

        int original = num;
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem * rem;
            num /= 10;
        }
        return ans == original;
        /*

        if (ans == original){
            return true;
        }
        return false;

         */
    }

    static boolean isArmstrong1(int num){
        int digits = String.valueOf(num).length();

        double ans = 0;
        while (num > 0){
            int rem = num % 10;
            ans = ans + Math.pow(rem,digits);
            num /= 10;
        }
        return num == ans;
    }

}