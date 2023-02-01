package com.methods;

import java.util.Scanner;

public class Quetsion_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }

        int check = 2;
        while (check*check <= n){
            if (n % check == 0){
                return false;
            }
            check++;
        }
        return true;
    }
}
