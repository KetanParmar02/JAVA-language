package com.Assignment_2.Basic;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {

        // Area Of Triangle = 1/2*base*height

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Triangle Base value = ");
        double base = in.nextDouble();

        System.out.print("Enter Triangle Height value = ");
        double height = in.nextDouble();

        double area = (1.0/2.0)*base*height;
        System.out.println("Triangle Area value = "+area);
    }
}
