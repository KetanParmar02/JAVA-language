package com.Array;

import java.net.SecureCacheResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // syntax of an ArrayList
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//
//        System.out.println(list);
//
//        list.set(5,76);
//        System.out.println(list.hashCode());
//        System.out.println(list.contains(2));
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // output print
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
