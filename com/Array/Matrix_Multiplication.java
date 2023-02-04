package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        // Matrix SUM

        /*
            matrix 1 = [1 2 3]                matrix 2 = [1 2 3]
                       [4 5 6]                           [4 5 6]
                       [7 8 9]                           [7 8 9]
                         matrix size = 3 x 3                    matrix size = 3 x 3
                                       R1 X C1                                R2 X C2
             if(C1 = R2) matrix 1 column size = matrix 2 row size then and then matrix multiplication is performed

             (matrix 1) *(matrix 2) =   then answer matrix size is = R1 X C2
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Matrix-1");
        System.out.print("Enter Matrix-1 Row size= ");
        int R1 = in.nextInt();

        System.out.print("Enter Matrix-1 Column size= ");
        int C1 = in.nextInt();

        int[][] matrix_1 = new int[R1][C1];
        System.out.println("Generated Random Matrix= ");

        for (int row = 0; row < matrix_1.length; row++) {
            for (int col = 0; col < matrix_1[row].length; col++) {
                matrix_1[row][col] = (int) (Math.random()*10);
            }
        }

        // print matrix-1 value using enhance for loop
        for (int[] mat_1: matrix_1) {
            System.out.println(Arrays.toString(mat_1));
        }

        System.out.println("----------------------------------------");

        System.out.println("Matrix-2");

        System.out.print("Enter Matrix-2 Row size= ");
        int R2 = in.nextInt();

        System.out.print("Enter Matrix-2 Column size= ");
        int C2 = in.nextInt();

        int[][] matrix_2 = new int[R2][C2];
        System.out.println("Generated Random Matrix= ");

        for (int row = 0; row < matrix_2.length; row++) {
            for (int col = 0; col < matrix_2[row].length; col++) {
                matrix_2[row][col] = (int) (Math.random()*10);
            }
        }

        // print matrix-2 value using enhance for loop
        for (int[] mat_2:matrix_2) {
            System.out.println(Arrays.toString(mat_2));
        }

        System.out.println("----------------------------------------");

        // now we check if row and column size is equal then and then matrix sum is possible
        if (C1 == R2){
            int[][] ans = new int[R1][C2];
            System.out.println("Matrix of Two Sum= ");

            for (int row = 0; row < ans.length; row++) {
                for (int col = 0; col < ans[row].length; col++) {
                    ans[row][col] = 0;
                    for (int row_column = 0; row_column < C1; row_column++) {
                        ans[row][col] += matrix_1[row][row_column] * matrix_2[row_column][col];
                    }
                }
            }

            // print Sum of two matrix using enhance for loop
            for (int[] answer:ans) {
                System.out.println(Arrays.toString(answer));
            }
            }else {
            System.out.println("Matrix-1 column and Matrix-2 row size is not same..");
            System.out.println("So, Matrix Multiplication is not possible....");
        }
    }
}
