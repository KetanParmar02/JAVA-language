package com.Arra_Assignment.Easy;

//URL=https://leetcode.com/problems/build-array-from-permutation/

import java.util.Arrays;
import java.util.Scanner;

public class Que_LeetCode_1920 {
    public static void main(String[] args) {

        //   Build Array from Permutation
        Scanner in = new Scanner(System.in);

        int[] arr = new int[6];
        System.out.print("Enter Array Element = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Given Array = ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Build Array = ");
        int[] ans = BuildArray(arr);
        System.out.println(Arrays.toString(ans));

    }
    /*
         Example 1 =  Input: nums = [0,2,1,5,3,4]
                      Output: [0,1,2,4,5,3]
                      Explanation: The array ans is built as follows:
                      ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
                          = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
                          = [0,1,2,4,5,3]


         Example 2 = Input: nums = [5,0,1,2,3,4]
                     Output: [4,5,0,1,2,3]
                     Explanation: The array ans is built as follows:
                     ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
                         = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
                         = [4,5,0,1,2,3]
     */
    static int[] BuildArray(int[] nums){
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
