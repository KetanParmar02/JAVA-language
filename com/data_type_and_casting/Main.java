package com.data_type_and_casting;

public class Main {
    public static void main(String[] args) {
        /* =========== VARIABLE AND DATA TYPE ============= */

        byte num1 = 114;
        short _num2 = 345;
        int num3 = 644;
        long num4 = 7658479598756745489l;
        float num$5 = 74476.9785643f;
        double num6 = 4875674674654.65843467434834;
        float n = 0x7E;
        float n1 = 7e12f;

        double ans = (num1+_num2)+(num3/num4)-(num$5+num1)*(_num2-num6)/(num6+_num2);

        System.out.println(n1);
        System.out.println(n);
        System.out.println("The value of num1= "+num1);
        System.out.println("The value of num2= "+_num2);
        System.out.println("The value of num3= "+num3);
        System.out.println("The value of num4= " +num4);
        System.out.println("The value of num5= "+num$5);
        System.out.println("The value of num6= "+num6);
        System.out.println((num1+_num2));
        System.out.println((num3/num4));
        System.out.println((num$5+num1));
        System.out.println((_num2-num6));
        System.out.println((num6+_num2));
        System.out.println("The final answer= "+ans);

        System.out.println("Smile Emoji:- 😄");
    }
}
