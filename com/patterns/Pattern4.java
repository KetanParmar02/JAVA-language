package com.patterns;

public class Pattern4 {
    public static void main(String[] args) {
        pattern(10);
    }
    // pattern
    //   1
    //   1 2
    //   1 2 3
    //   1 2 3 4
    //   1 2 3 4 5
    //   1 2 3 4 5 6
    //   1 2 3 4 5 6 7
    //   1 2 3 4 5 6 7 8
    //   1 2 3 4 5 6 7 8 9
    //   1 2 3 4 5 6 7 8 9 10
    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
