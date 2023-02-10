package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_13 {
    public static void main(String[] args) {

        // Perimeter Of Rhombus = 4*side
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side value = ");
        double side = in.nextDouble();

        double area = 4 * side;
        System.out.println("Perimeter Of Rhombus = "+area);
    }
}
