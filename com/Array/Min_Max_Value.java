package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Max_Value {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Generated Random Array= ");
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));

        int[] ans = Min_Max(arr, 0,9);
        System.out.println("Minimum and Maximum Value = "+Arrays.toString(ans));
    }
    static int[] Min_Max(int[] nums, int start, int end){
        int Min_Value = Integer.MAX_VALUE;
        int Max_Value = Integer.MIN_VALUE;

        // find Min value
        for (int i = start; i <= end; i++) {
            if (nums[i] < Min_Value){
                Min_Value = nums[i];
            }
        }

        // find Max value
        for (int i = start; i <= end; i++) {
            if (nums[i] > Max_Value){
                Max_Value = nums[i];
            }
        }

        return new int[]{Min_Value , Max_Value};
    }
}
