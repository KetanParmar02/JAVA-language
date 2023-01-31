package com.methods;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        greet();

        String name = greet2();
        System.out.println("My name is "+name);

        String message = greet3("Ketan");
        System.out.println(message);
    }

    static void greet(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name= ");
        String name = in.next();

        System.out.println("My name is "+name);
    }

    // return the string
    static String greet2(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name= ");
        String name = in.nextLine();

        return name;
    }

    // pass the argument in the function
    static String greet3(String name){
        return "Hello "+name;
    }
}
