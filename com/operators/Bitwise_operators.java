package com.operators;

import java.util.Scanner;

public class Bitwise_operators {
    public static void main(String[] args) {

        /*
                        Bitwise operator
               1). AND -> &
               2). OR -> |
               3). COMPLEMENT ->
               4). XOR -> ^
               5). RIGHT SHIFT -> >>
               6). LEFT SHIFT -> <<
               7). SHIFT RIGHT ZERO FILL -> >>>
         */

        // 1). Bitwise AND Operator
        /*
           If both values are 1 than and than ans 1 otherwise 0.
                example :-
                a = 5, b= 4 -> decimal
                a = 0101  -> binary
                b = 0100  -> binary
              -------------
               ans= 0100
         */

        // 2). Bitwise OR Operator
        /*
           If any value is 1 or both values are 1 then ans 1 otherwise 0.
                example :-
                a = 5, b= 4
                a = 0101
                b = 0100
              -------------
               ans= 0101
         */

        // 3). Bitwise XOR Operator
        /*
           If any one value is 1 then ans 1 if both values are 1 or 0 then ans 0.
                example :-
                a = 5, b= 4
                a = 0101
                b = 0100
              -------------
               ans= 0001
         */

        // 4). Bitwise COMPLEMENT Operator
        /*
                example :-
                a = 5
                a = 0101
                ans = ~a
                ans = 1010
         */

        // 5). Bitwise RIGHT-SHIFT Operator
        /*
                example :-
                a = 5 by 2 right shift
                a = 0101 >> 2
                ans = 0001
                -> in given example a = 0101 and n = 2
                formula = ans = a / 2^n -> here a = given value and n = how many bits are shifted

         */

        // 6). Bitwise LEFT-SHIFT Operator
        /*
                example :-
                a = 5 by 2 right shift
                a = 0101 << 2
                ans = 0001
                -> in given example a = 0101 and n = 2
                formula = ans = a * 2^n -> here a = given value and n = how many bits are shifted

         */

        // 7). Bitwise RIGHT-SHIFT ZERO FILL Operator
        /*
                example :-
                a = 5 by 2 right shift
                a = 0101 >> 2
                ans = 0001

         */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value a:- ");
        int a = in.nextInt();
        System.out.println("Enter value b:- ");
        int b = in.nextInt();
        int ans = a & b;
        int ans1 = a | b;
        int ans2 = a ^ b;
        int ans3 = a >> b;
        int ans4 = a << b;
        System.out.println("Ans= "+ans);
        System.out.println("Ans1= "+ans1);
        System.out.println("Ans2= "+ans2);
        System.out.println("Ans3= "+ans3);
        System.out.println("Ans4= "+ans4);
    }
}
