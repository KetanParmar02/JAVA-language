package com.Assignment_1;

import java.util.Scanner;

public class Que_8 {
    public static void main(String[] args) {

        // To find out whether the given String is Palindrome or not.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String= ");
        String name = in.next();
        String reverse = "";

        for (int i = name.length()-1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }

        if (name.equals(reverse)){
            System.out.println("Given String is Palindrome..");
        }else {
            System.out.println("Given String is not Palindrome..");
        }
    }
}
