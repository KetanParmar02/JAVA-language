package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_1 {
    public static void main(String[] args) {

        // Area of circle = Π*r*r , where r = radius of circle

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Circle Radius Value= ");
        double radius = in.nextDouble();

        double Area = Math.PI*radius*radius;
        System.out.println("Area of Circle = "+Area);
    }
}
