package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Multi_dimensional_Array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr= new int[3][3];
        System.out.println("Generated Random 2D Array:- ");

        // Take the input form the random method
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = (int) (Math.random()*100);
            }
        }

        // print the 2D Array using enhance for loop
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

//       for (int row = 0; row < arr.length; row++) {
//           System.out.println(Arrays.toString(arr[row]));
//       }
    }
}
