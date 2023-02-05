package com.Array;

import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args) {

        // syntax of an ArrayList
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list);

        list.set(5,76);
        System.out.println(list.hashCode());
        System.out.println(list.contains(2));
        System.out.println(list);
    }
}
