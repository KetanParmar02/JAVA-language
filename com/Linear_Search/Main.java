package com.Linear_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // find the given element present in the Array or not.
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

        int ans = linearSearch(arr,target);
        int ans1 = linearSearch2(arr,target);
        boolean ans2 = linearSearch3(arr,target);

        System.out.println("The target element at "+ans+" index.");
        System.out.println("The target element = "+ans1);
        System.out.println("The target element present in the Array is "+ans2);
    }

    // if the element found in the array return index otherwise -1
    static int linearSearch(int[] nums, int target){

        if (nums.length == 0){
            return -1;
        }

        // for loop for finding the element present in the array or not.
        for (int index = 0; index < nums.length; index++) {

            // here if condition check if the that index value == target element or not if true then return the index value otherwise return -1
            if (nums[index] == target){
                return index;
            }
        }
        return -1;
    }

    // search the target and return the element
    static int linearSearch2(int[] nums, int target){

        if (nums.length == 0){
            return Integer.MAX_VALUE;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return nums[i];
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        // here return the Integer.MAX_VALUE because -1 may be element these reason not return -1;
        return Integer.MAX_VALUE;
    }

    // search the target element if present in the array return true otherwise false
    static boolean linearSearch3(int[] nums, int target){

        if (nums.length == 0){
            return false;
        }

        // for loop for finding the element
        for (int i = 0; i < nums.length; i++) {

            // if condition check if the element present return true
            if (nums[i] == target){
                return true;
            }
        }

        // if none of above return statement execute
        return false;
    }
}
