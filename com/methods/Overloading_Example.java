package com.methods;

import java.util.Arrays;

public class Overloading_Example {
    public static void main(String[] args) {
        int ans = sum(3,6);
        System.out.println("The sum of two number= "+ans);

        int ans1 = sum(3,6,7);
        System.out.println("The sum of two number= "+ans1);

        demo(3,4,5,6,7,44,46);
        demo("Ketan","kelvin","dipesh","mother","father");
    }
    static int sum(int num1, int num2){
        return num1+num2;
    }

    static int sum(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

}
