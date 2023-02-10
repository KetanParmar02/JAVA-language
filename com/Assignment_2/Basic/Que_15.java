package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_15 {
    public static void main(String[] args) {

        // Volume Of Prism = [(1/2)*(base*height)]*prism height
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base value = ");
        double base = in.nextDouble();

        System.out.println("Enter height value = ");
        double height = in.nextDouble();

        System.out.println("Enter prism height value = ");
        double prism_height = in.nextDouble();

        double area = ((1.0/2.0)*base*height)*prism_height;
        System.out.println("Volume of Prism = "+area);
    }
}
