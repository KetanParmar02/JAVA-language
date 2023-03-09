package com.Array;

public class Palindrom_Array {
    public static void main(String[] args) {
        char[] arr = {'R','A','C','C','A','R','A'};
        boolean ans = isPalindrom(arr);

        System.out.println("This word is palindrom is "+ans);
    }
    static boolean isPalindrom(char[] nums){
        int start = 0;
        int end = nums.length-1;

        while (start < end){
            if (nums[start] == nums[end]){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}
