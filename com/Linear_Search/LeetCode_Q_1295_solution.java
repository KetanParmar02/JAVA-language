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
}
