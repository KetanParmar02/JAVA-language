package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) {

        // Area Of Parallelogram (સમાંતરગ્રામનું ક્ષેત્રફળ) = b*h
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base value = ");
        double base = in.nextDouble();

        System.out.print("Enter Height value = ");
        double height = in.nextDouble();

        double area = base*height;
        System.out.println("Parallelogram Area value = "+area);
    }
}
