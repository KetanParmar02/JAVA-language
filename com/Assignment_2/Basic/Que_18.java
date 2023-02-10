package com.Assignment_2.Basic;

import java.util.Scanner;

public class Que_18 {
    public static void main(String[] args) {

        // Volume Of Pyramid = (1/3)*(base)*(width)*(height)
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Pyramid base value = ");
        double base = in.nextDouble();

        System.out.println("Enter Pyramid width value = ");
        double width = in.nextDouble();

        System.out.println("Enter Pyramid height value = ");
        double height = in.nextDouble();

        double area = (1.0/3.0)*base*width*height;
        System.out.println("Volume of Pyramid = "+area);
    }
}
