package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Value_In_2D_Array {
    public static void main(String[] args) {
        // max value in 2D Array
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

        float ans = Max_Value(arr);
        System.out.println("Max Value in 2D Array= "+ans);
    }

    static float Max_Value(float[][] nums) {
        float Max_value = Float.MIN_VALUE;

        if (nums.length == 0){
            return -1;
        }

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] > Max_value){
                    Max_value = nums[row][col];
                }
            }
        }
        // enhance for loop
    /*
        for (float[] num : nums) {
            for (float v : num) {
                if (v > Max_value) {
                    Max_value = v;
                }
            }
        }

    */
        return Max_value;
    }

}
