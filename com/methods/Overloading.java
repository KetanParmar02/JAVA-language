package com.methods;

public class Overloading {
    public static void main(String[] args) {
        fun(330);
        fun("Ketan");
        
    }
    static void fun(int num){
        System.out.println(num);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
