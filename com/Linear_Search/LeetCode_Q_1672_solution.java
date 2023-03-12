package com.Linear_Search;

import java.util.Arrays;

public class LeetCode_Q_1672_solution {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];

        System.out.println("Generated random Array:- ");
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = (int) (Math.random()*100);
            }
            System.out.println(Arrays.toString(arr1[row]));
        }

        int ans = maximum_Wealth(arr1);
        System.out.println("The total bank accounts of Richest person is= "+ans);
    }

    //check every person how many bank account and print the sum of all bank account
    static int maximum_Wealth(int[][] accounts){

        // person = row
        // account = col
        // checke_every_person_bank_account_sum and return the heighest value.
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int rowSum = 0;

            for (int account = 0; account < accounts[person].length; account++) {
                rowSum += accounts[person][account];
            }
            System.out.println("The "+(person + 1)+" person"+" total bank account is= "+rowSum);
            if (ans < rowSum){
                ans = rowSum;
            }
        }
        return ans;
    }

    /*
    Example 1:

    Input: accounts = [[1,2,3],[3,2,1]]
    Output: 6
    Explanation:
    1st customer has wealth = 1 + 2 + 3 = 6
    2nd customer has wealth = 3 + 2 + 1 = 6
    Both customers are considered the richest with a wealth of 6 each, so return 6.

    Example 2:

    Input: accounts = [[1,5],[7,3],[3,5]]
    Output: 10
    Explanation:
    1st customer has wealth = 6
    2nd customer has wealth = 10
    3rd customer has wealth = 8
    The 2nd customer is the richest with a wealth of 10.

    Example 3:

    Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
    Output: 17


    Constraints:

    m == accounts.length
    n == accounts[i].length
    1 <= m, n <= 50
    1 <= accounts[i][j] <= 100
     */
}
