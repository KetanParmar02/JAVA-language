package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_9 {
    public static void main(String[] args) {

        // Perimeter Of Equilateral Triangle(સમભુજ ત્રિકોણની પરિમિતિ) C = 3*side
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side value = ");
        double side = in.nextDouble();

        double area = 3 * side;
        System.out.println("Perimeter Of Equilateral Triangle = "+area);
    }
}
