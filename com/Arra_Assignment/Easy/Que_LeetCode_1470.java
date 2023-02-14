package com.Arra_Assignment.Easy;

// URL=https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;
import java.util.Scanner;

public class Que_LeetCode_1470 {
    public static void main(String[] args) {
        // Shuffle the Array
        int[] arr = {1,2,3,4,4,3,2,1};

        System.out.print("Generate Array = ");
        int[] ans = ShuffleArray(arr,4);
        System.out.println(Arrays.toString(ans));
    }
    /*
        Example 1 = Input: nums = [2,5,1,3,4,7], n = 3
                    Output: [2,3,5,4,1,7]
                    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

        Example 2 = Input: nums = [1,2,3,4,4,3,2,1], n = 4
                    Output: [1,4,2,3,3,2,4,1]
     */

    static int[] ShuffleArray(int[] nums, int n){
        int[] ans = new int[2*n];
        int j = 0;
        for(int i=0; i<= 2*n; i+=2){
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
            j++;
        }
        return ans;
    }
}
