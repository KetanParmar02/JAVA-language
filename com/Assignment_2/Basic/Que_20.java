package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_20 {
    public static void main(String[] args) {

        // Total Surface Area Of Cube = 6*length*length
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length of Cube = ");
        double length = in.nextDouble();

        double area = 6*length*length;
        System.out.println("Area of Cube = "+area);
    }
}
