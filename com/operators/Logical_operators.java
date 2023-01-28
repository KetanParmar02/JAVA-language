package com.operators;

public class Logical_operators {
    public static void main(String[] args) {

        /*                  LOGICAL OPERATOR
                        ------------------------
            1). AND -> &&
            2). OR -> ||
            3). NOT -> !
        */
        int x = 64;
        int y = 75;
        int a = 643;
        int b = 756;

        boolean result = x > y && a < b;
        boolean result1 = x > y && a < b;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(!result1);
    }
}
