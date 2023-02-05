package com.patterns;

public class Pattern1 {
    public static void main(String[] args) {
        pattern1(5);
    }
    // print the pattern entering the number
    //    *****
    //    *****
    //    *****
    //    *****
    //    *****
    static void pattern1(int n){
        // first for loop for how many rows are there
        for (int row = 1; row <= n; row++) {
            // second for loop for how many columns are print the pattern
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // In every raw print then add the new line for print *
            System.out.println();
        }
    }
}
