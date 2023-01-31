package com.methods;

public class Overloading_Example {
    public static void main(String[] args) {
        int ans = sum(3,6);
        System.out.println("The sum of two number= "+ans);

        int ans1 = sum(3,6,7);
        System.out.println("The sum of two number= "+ans1);
    }
    static int sum(int num1, int num2){
        return num1+num2;
    }

    static int sum(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}
