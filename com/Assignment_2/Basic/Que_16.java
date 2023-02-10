package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_16 {
    public static void main(String[] args) {

        // Volume Of Cylinder = Π*radius*radius*height
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Cylinder radius value = ");
        double radius = in.nextDouble();

        System.out.println("Enter Cylinder height value = ");
        double height = in.nextDouble();

        double area = Math.PI*radius*radius*height;
        System.out.println("Area of Cylinder = "+area);
    }
}
