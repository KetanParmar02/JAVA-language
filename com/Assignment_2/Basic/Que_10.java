package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_10 {
    public static void main(String[] args) {

        // Perimeter Of Parallelogram(સમાંતરગ્રામની પરિમિતિ) = 2*(b+h)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base value = ");
        double base = in.nextDouble();

        System.out.print("Enter Height value = ");
        double height = in.nextDouble();

        double area = 2*(base + height);
        System.out.println("Perimeter Of Parallelogram = "+area);
    }
}
