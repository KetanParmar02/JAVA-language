package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Value_In_1D_Array {
    public static void main(String[] args) {
        // Max Value in 1D Array
        Scanner in = new Scanner(System.in);

        float[] arr = new float[5];
        System.out.print("Generated Random Array= ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (Math.random()*10.000);
        }

        System.out.println(Arrays.toString(arr));

        float ans = Max_Value(arr);
        System.out.println("Max Value in 1D Array= "+ans);

        float ans1 = Max(arr,1,4);
        System.out.print("Max Value in given Array range= "+ans1);
    }
    static float Max_Value(float[] nums){
        float max_value = Float.MIN_VALUE;

        if (nums.length == 0){
            return -1;
        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > max_value){
//                max_value = nums[i];
//            }
//        }

        // enhance for loop using find max-value
        for (float ans : nums) {
            if (ans > max_value) {
                max_value = ans;
            }
        }
        return max_value;
    }

    // find max value in range
    static float Max(float[] nums, int start, int end){
        float max_value = Float.MIN_VALUE;

        if (nums.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (nums[i] > max_value){
                max_value = nums[i];
            }
        }
        return max_value;
    }
}
