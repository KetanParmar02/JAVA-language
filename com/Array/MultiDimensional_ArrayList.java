package com.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensional_ArrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Arraylist Element= ");
        ArrayList<ArrayList<Double>> list = new ArrayList<>();

        // initialize the how many size of the ArrayList
        // how many ow in the Array
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add the Arraylist Element in the 2D arraylist
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add((Math.random()*100));
            }
        }

        System.out.println(list);
    }
}
