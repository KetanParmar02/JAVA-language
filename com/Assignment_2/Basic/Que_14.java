package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_14 {
    public static void main(String[] args) {

        // Volume Of Cone(શંકુનું પ્રમાણ) = πr^2h/3
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius value = ");
        double radius = in.nextDouble();

        System.out.print("Enter height value = ");
        double height = in.nextDouble();

        double area = (Math.PI*radius*radius*height)/3;
        System.out.println("Volume Of Cone = "+area);
        
    }
}
