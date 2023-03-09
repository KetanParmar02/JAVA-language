package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Max_In_2D_Array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println("Generated Random Array= ");

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int) (Math.random()*100);
            }
        }

        // print the array row
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println();

        int[] ans = Min_Max_2D(arr);
        System.out.println("Minimum and Maximum Value = "+ Arrays.toString(ans));

    }
    static int[] Min_Max_2D(int[][] nums){
        int Min_value = Integer.MAX_VALUE;
        int Max_value = Integer.MIN_VALUE;

        if (nums.length == 0){
            return new int[]{-1,-1};
        }

        // Min value in 2D array
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] < Min_value){
                    Min_value = nums[row][col];
                }
            }
        }

        // Max value in 2D array
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] > Max_value){
                    Max_value = nums[row][col];
                }
            }
        }

        return new int[]{Min_value , Max_value};
    }
}
