package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {

        // Area of Isosceles triangle(સમદ્વિબાજુ ત્રિકોણનું ક્ષેત્રફળ) = Base * Height /2
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Triangle Base value = ");
        double base = in.nextDouble();

        System.out.print("Enter Triangle Height value = ");
        double height = in.nextDouble();

        double area = (1.0/2.0)*base*height;
        System.out.println("Triangle Area value = "+area);
    }
}
