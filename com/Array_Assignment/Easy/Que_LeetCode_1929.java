package com.Arra_Assignment.Easy;

// URL=https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;
import java.util.Scanner;

public class Que_LeetCode_1929 {
    public static void main(String[] args) {

        // Concatenation of Array
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Array size = ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Element = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Given Array = ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Build Array = ");
        int[] ans = Concatenation_Array(arr);
        System.out.println(Arrays.toString(ans));

    }
    /*
        Example 1 = Input: nums = [1,2,1]
                    Output: [1,2,1,1,2,1]
                    Explanation: The array ans is formed as follows:
                    - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
                    - ans = [1,2,1,1,2,1]

        Example 2 = Input: nums = [1,3,2,1]
                    Output: [1,3,2,1,1,3,2,1]
                    Explanation: The array ans is formed as follows:
                    - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
                    - ans = [1,3,2,1,1,3,2,1]
     */
    static int[] Concatenation_Array(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }

        return ans;
    }
}
