package com.methods;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        greet();
    }
    static void greet(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name= ");
        String name = in.next();

        System.out.println("My name is "+name);
    }
}
