package com.Array;

import java.util.Arrays;

public class Two_D_Array_nofixed_col {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3,4},
                {5,6,7},
                {8,9},
                {0}
        };

        for (int[] ans:arr) {
            System.out.println(Arrays.toString(ans));
        }
    }
}
