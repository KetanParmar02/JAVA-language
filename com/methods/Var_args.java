package com.methods;

import java.util.Arrays;

public class Var_args {
    public static void main(String[] args) {
        var_args(34,5,56,3,2,5,1,2);
        var_args("ketan","kelvin","dipesh","father","mother","grandfather");
        int ans = var_args(23,56,"ketan","kelvin","dipesh","father","mother","grandfather");
        System.out.println("The sum of two num= "+ans);
    }
    static void var_args(int ...num){
        System.out.println(Arrays.toString(num));
    }
    static void var_args(String ...name){
        System.out.println(Arrays.toString(name));
    }

    // multiple & mix data_type arguments in methods
    static int var_args(int a, int b, String ...name){
        System.out.println(Arrays.toString(name));
        return a+b;
    }
}
