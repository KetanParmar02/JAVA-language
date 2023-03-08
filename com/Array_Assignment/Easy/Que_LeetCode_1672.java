package com.Arra_Assignment.Easy;

// URL=https://leetcode.com/problems/richest-customer-wealth/

import java.util.Arrays;
import java.util.Scanner;

public class Que_LeetCode_1672 {
    public static void main(String[] args) {
        // Richest Customer Wealth
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Array Row size = ");
        int row = in.nextInt();
        System.out.print("Enter Array Column size = ");
        int column = in.nextInt();

        int[][] arr = new int[row][column];
        System.out.print("Enter Array Element = ");

        for (int row1 = 0; row1 < arr.length; row1++) {
            for (int column1 = 0; column1 < arr[row1].length; column1++) {
                arr[row1][column1] = in.nextInt();
            }
        }

        System.out.println("Given Array = ");
        // print the array
        for (int row2 = 0; row2 < arr.length; row2++) {
            System.out.println(Arrays.toString(arr[row2]));
        }

        int ans = RichestCustomer(arr);
        System.out.println("The Richest Customer Wealth = "+ans);


    }
    /*
        Example 1 = Input: accounts = [[1,2,3],[3,2,1]]
                    Output: 6
                    Explanation:
                    1st customer has wealth = 1 + 2 + 3 = 6
                    2nd customer has wealth = 3 + 2 + 1 = 6
                    Both customers are considered the richest with a wealth of 6 each, so return 6.

        Example 2 = Input: accounts = [[1,5],[7,3],[3,5]]
                    Output: 10
                    Explanation:
                    1st customer has wealth = 6
                    2nd customer has wealth = 10
                    3rd customer has wealth = 8
                    The 2nd customer is the richest with a wealth of 10.
     */
    static int RichestCustomer(int[][] accounts){
        // person = row
        // account = col
        // check_every_person_bank_account_sum and return the highest value.

        /* check_every_person_bank_account_sum = ans  */
        int ans = Integer.MIN_VALUE;

        for(int person = 0; person<accounts.length; person++){
            // sum the every person bank account

            int rowsum = 0;

            for(int account = 0; account < accounts[person].length; account++){
                rowsum += accounts[person][account];
            }

            if(rowsum > ans){
                ans = rowsum;
            }
        }
        return ans;
    }
}
