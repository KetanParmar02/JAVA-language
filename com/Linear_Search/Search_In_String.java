package com.Linear_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Search_In_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String = ");
        String name = in.next();
        char target = 'a';
        System.out.println("character array = "+ Arrays.toString(name.toCharArray()));

        boolean ans = String(name, target);
        System.out.println("The target character present is "+ans);
    }
    // find the target character is present in the string or not
    static boolean String(String name, char target){

        // here check the string is null then return false
        if (name.length() == 0){
            return false;
        }

        // for loop check if character is present or not
        for (int i = 0; i < name.length(); i++) {
            // here if condition check if the character is present return true otherwise false
            if (target == name.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
