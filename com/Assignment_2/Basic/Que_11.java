package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_11 {
    public static void main(String[] args) {

        // Perimeter Of Rectangle(લંબચોરસની પરિમિતિ) = 2*(length + width)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length Value = ");
        double length = in.nextDouble();

        System.out.print("Enter Width Value = ");
        double width = in.nextDouble();

        double area = 2*(length + width);
        System.out.println("Perimeter Of Rectangle = "+area);
    }
}
