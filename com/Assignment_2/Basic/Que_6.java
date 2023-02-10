package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_6 {
    public static void main(String[] args) {

        // Area Of Rhombus (Using Diagonals) =  ½ × d1 × d2
        // d1 = length of diagonal 1
        // d2 = length of diagonal 2

        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of diagonal 1 = ");
        double d1 = in.nextDouble();

        System.out.print("Enter length of diagonal 1 = ");
        double d2 = in.nextDouble();

        double area = (1.0/2.0)*d1*d2;
        System.out.println("Area of Rhombus = "+area);
    }
}
