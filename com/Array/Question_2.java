package com.Array;

import javax.print.AttributeException;
import java.util.Arrays;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[9];
        System.out.print("Generated Random Array= ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(arr));

        reverse(arr, 0, 9);

        System.out.print("Reverse Array= ");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr, int start, int end) {
        start = 0;
        end = arr.length-1;

        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }
}
