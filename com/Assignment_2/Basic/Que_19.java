package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_19 {
    public static void main(String[] args) {

        // Curved Surface Area Of Cylinder = 2*Π*radius*height

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Cylinder Radius value = ");
        double radius = in.nextDouble();

        System.out.println("Enter Cylinder Height value = ");
        double height = in.nextDouble();

        double area = 2*Math.PI*radius*height;
        System.out.println("Area of Cylinder = "+area);
    }
}
