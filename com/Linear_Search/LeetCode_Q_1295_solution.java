package com.Linear_Search;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode_Q_1295_solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Generated Random Array = ");
        int[] arr = new int[10];
        for (int row = 0; row < arr.length; row++) {
            arr[row] = (int) (Math.random()*1000/9);
        }
        System.out.println(Arrays.toString(arr));

        int ans = findEven(arr);
        System.out.println("The total Even digits number is= "+ans);

    }
    // check how many array number is even
    static int findEven(int[] nums){
        // here count variable for count how many numbers contain even number digit
        int count = 0;

    /*
        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i])){
                count++;
            }
        }
    */
        // or enhance for loop

        for (int num : nums) {
            if (isEven(num)) {
                count++;
            }
        }
        return count;
    }

    // check that number contain the even numbers of digits or not
    static boolean isEven(int num){
        int count = digits(num);
        return count % 2 == 0;
    }

    // here digits method check the how many digits in the array
    static int digits(int num){
        if(num < 0){
            num *= (-1);
        }

        if (num == 0){
            return 1;
        }

        int digit = 0;
        while (num > 0){
            digit++;
            num /= 10;
        }
        return digit;
    }

    /*
    Example 1:

    Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation:
    12 contains 2 digits (even number of digits).
    345 contains 3 digits (odd number of digits).
    2 contains 1 digit (odd number of digits).
    6 contains 1 digit (odd number of digits).
    7896 contains 4 digits (even number of digits).
    Therefore only 12 and 7896 contain an even number of digits.

    Example 2:

    Input: nums = [555,901,482,1771]
    Output: 1
    Explanation:
    Only 1771 contains an even number of digits.


    Constraints:

    1 <= nums.length <= 500
    1 <= nums[i] <= 105
     */
}
