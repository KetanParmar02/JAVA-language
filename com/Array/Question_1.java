package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float[] arr = new float[5];
        System.out.print("Generated Random Array= ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (Math.random()*10.000);
        }

        System.out.println(Arrays.toString(arr));
        System.out.print("Swap Array index= ");
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(float[] nums, int index1, int index2){
        float temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
