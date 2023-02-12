package com.Assignment_2.Basic;

public class Que_21 {
    public static void main(String[] args) {
        System.out.println(System.nanoTime());
        int ans = subtractProductAndSum(3554);
        System.out.println(ans);
        System.out.println(System.nanoTime());

    }
    // https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
    // 1281. Subtract the Product and Sum of Digits of an Integer
        /* Example -
              1)        Input: n = 234
                        Output: 15
                        Explanation:
                        Product of digits = 2 * 3 * 4 = 24
                        Sum of digits = 2 + 3 + 4 = 9
                        Result = 24 - 9 = 15

              2)        Input: n = 4421
                        Output: 21
                        Explanation:
                        Product of digits = 4 * 4 * 2 * 1 = 32
                        Sum of digits = 4 + 4 + 2 + 1 = 11
                        Result = 32 - 11 = 21
         */

    static int subtractProductAndSum(int num){
        int sum = 0;
        int product = 1;

        while (num > 0){
            int rem = num % 10;
            sum += rem;
            product *= rem;
            num /= 10;
        }
        return product - sum;
    }

}
