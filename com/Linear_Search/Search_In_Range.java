package com.Linear_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Search_In_Range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Generated Random Array = ");
        int[] arr = new int[10];

        // generate the array element
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random()*10);
        }

        // print the array
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the Target element = ");
        int target = in.nextInt();

        boolean ans = linearSearch3(arr, target, 2,8);
        System.out.println("The target element present in the Array is "+ans);
    }
    // search the target element in the range if present in the array return true otherwise false
    static boolean linearSearch3(int[] nums, int target, int start, int end){

        if (nums.length == 0){
            return false;
        }

        // for loop for finding the element
        for (int i = start; i <= end; i++) {

            // if condition check if the element present return true
            if (nums[i] == target){
                return true;
            }
        }

        // if none of above return statement execute
        return false;
    }
}
