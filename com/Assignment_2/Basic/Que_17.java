package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_17 {
    public static void main(String[] args) {

        // Volume of Sphere = 4/3*Π*radius*radius*radius

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Sphere Radius Value= ");
        double radius = in.nextDouble();

        double area = (4.0/3.0)*radius*radius*radius;
        System.out.println("Volume of Sphere = "+area);
    }
}
