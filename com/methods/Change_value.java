package com.methods;

import java.util.Arrays;

public class Change_value {
    public static void main(String[] args) {
        int[] arr = {53,37,96,51};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 89;
    }
}
