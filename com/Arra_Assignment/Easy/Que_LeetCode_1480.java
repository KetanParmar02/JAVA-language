package com.Arra_Assignment.Easy;

// URL=https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;
import java.util.Scanner;

public class Que_LeetCode_1480 {
    public static void main(String[] args) {
        // Running Sum of 1d Array
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

        System.out.print("SUM of All Running Element = ");
        int[] ans = RunningSum(arr);
        System.out.println(Arrays.toString(ans));
    }
    /*
        Example 1 = Input: nums = [1,2,3,4]
                    Output: [1,3,6,10]
                    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

        Example 2 = Input: nums = [1,1,1,1,1]
                    Output: [1,2,3,4,5]
                    Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
     */
    static int[] RunningSum(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = nums[0];
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i-1]+nums[i];
        }
        return ans;
    }
}
