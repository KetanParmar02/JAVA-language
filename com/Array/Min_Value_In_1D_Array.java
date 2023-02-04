package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Value_In_1D_Array {
    public static void main(String[] args) {
        // Min value in 1D Array
        Scanner in = new Scanner(System.in);

        System.out.print("Generated Random Array= ");
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));

        int ans = Min_Value(arr);
        System.out.print("Minimum Value in 1D Array= "+ans);
    }

    static int Min_Value(int[] nums) {
        int Min_value = Integer.MAX_VALUE;

        if (nums.length == 0){
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < Min_value){
                Min_value = nums[i];
            }
        }
        return Min_value;
    }
}
