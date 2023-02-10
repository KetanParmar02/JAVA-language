package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_8 {
    public static void main(String[] args) {

        // Perimeter Of Circle(વર્તુળની પરિમિતિ) C = 2*Π*r
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Circle Radius Value= ");
        double radius = in.nextDouble();

        double perimeter = 2*Math.PI*radius;
        System.out.println("Perimeter Of Circle = "+perimeter);
    }
}
