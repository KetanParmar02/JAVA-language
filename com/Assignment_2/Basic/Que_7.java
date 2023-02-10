package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_7 {
    public static void main(String[] args) {

        // Area Of Equilateral Triangle(સમભુજ ત્રિકોણનું ક્ષેત્રફળ) = (√3/4)a^2
        // where a = side of triangle

        Scanner in = new Scanner(System.in);
        System.out.print("Enter side value = ");
        double side = in.nextDouble();

        double area = (Math.sqrt(3.0)/4)*side*side;
        System.out.println("Area of Equilateral Triangle = "+area);
    }
}
