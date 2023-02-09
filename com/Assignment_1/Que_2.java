package com.Assignment_1;

import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {

        // Take name as input and print a greeting message for that particular name.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name= ");
        String name = in.next();

        System.out.println("Hello "+name);
    }
}
