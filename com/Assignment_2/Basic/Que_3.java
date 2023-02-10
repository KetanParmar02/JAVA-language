package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {

        // Area Of Rectangle Program = length * height
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length Value = ");
        double length = in.nextDouble();

        System.out.print("Enter Height Value = ");
        double height = in.nextDouble();

        double area = length * height;
        System.out.println("Area of Rectangular = "+area);
    }
}
