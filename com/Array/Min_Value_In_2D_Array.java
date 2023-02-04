package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Value_In_2D_Array {
    public static void main(String[] args) {
        // find min value in 2D Array
        Scanner in = new Scanner(System.in);

        float[][] arr = new float[3][3];
        System.out.println("Generated Random Array= ");

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (float) (Math.random()*10.00);
            }
        }

        // print the array row
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println();

        float ans = Min_Value(arr);
        System.out.println("Max Value in 2D Array= "+ans);
    }
    static float Min_Value(float[][] nums) {
        float Min_value = Float.MAX_VALUE;

        if (nums.length == 0){
            return -1;
        }

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] < Min_value){
                    Min_value = nums[row][col];
                }
            }
        }
        // enhance for loop
    /*
        for (float[] num : nums) {
            for (float v : num) {
                if (v > Min_value) {
                    Min_value = v;
                }
            }
        }

    */
        return Min_value;
    }
}
