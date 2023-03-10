package com.Linear_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Search_In_2D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Generate Random Array = ");
        int[][] arr = new int[3][3];

        // generate the random array element
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int) (Math.random()*100);
            }
        }

        // print the array
        for (int[] element:arr) {
            System.out.println(Arrays.toString(element));
        }

        System.out.print("Enter the target element = ");
        int target = in.nextInt();

        int[] ans = search1(arr, target,0,2);
        System.out.println("The target element index value = "+Arrays.toString(ans));
    }
    // search target element in the 2D array
    static int[] search(int[][] nums, int target){
        if (nums.length == 0){
            return new int[]{-1,-1};
        }

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // search in the 2D array in given range
    static int[] search1(int[][] nums, int target, int start, int end){
        if (nums.length == 0){
            return new int[]{-1,-1};
        }

        for (int row = start; row <= end; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
